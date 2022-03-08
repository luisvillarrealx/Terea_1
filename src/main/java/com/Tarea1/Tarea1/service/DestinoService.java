package com.Tarea1.Tarea1.service;

import com.Tarea1.Tarea1.domain.Destino;
import java.util.List;

public interface DestinoService {
    public List<Destino> getDestino();

    public void save(Destino destino);

    public void delete(Destino destino);

    public Destino getDestino(Destino destino);
}
