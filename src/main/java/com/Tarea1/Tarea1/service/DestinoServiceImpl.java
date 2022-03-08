package com.Tarea1.Tarea1.service;

import com.Tarea1.Tarea1.dao.DestinoDao;
import com.Tarea1.Tarea1.domain.Destino;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DestinoServiceImpl implements DestinoService{

    @Autowired
    private DestinoDao destinoDao;
    
    @Override
    @Transactional (readOnly = true)
    public List<Destino> getDestino() {
        return (List<Destino>)destinoDao.findAll();
    }

    @Override
    @Transactional
    public void save(Destino destino) {
        destinoDao.save(destino);
    }

    @Override
    public void delete(Destino destino) {
        destinoDao.delete(destino);
    }

    @Override
    @Transactional (readOnly = true)
    public Destino getDestino(Destino destino) {
        return destinoDao.findById(destino.getId_destino()).orElse(null);
    }
    
}
