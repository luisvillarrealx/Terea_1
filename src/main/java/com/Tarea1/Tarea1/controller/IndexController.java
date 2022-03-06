package com.Tarea1.Tarea1.controller;

import com.Tarea1.Tarea1.DestinoService.DestinoService;
import com.Tarea1.Tarea1.dao.DestinoDao;
import com.Tarea1.Tarea1.domain.Destino;

//import com.tienda.service.ClienteService;
//import com.tienda.service.clienteDao;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private DestinoDao destinoDao;
    
    @RequestMapping("/")
    public String inicio(Model model){
        var destinosDB = destinoDao.findAll();
        model.addAttribute("destinosDB", destinosDB);
        return "index";
    }
    
    
    
    @GetMapping ("/nuevoDestino")
    public String nuevoDestino (Destino destino){
        return "modificarDestino";
    }
    
    @PostMapping ("/guardarDestino")
    public String guardarDestino(Destino destino){
        destinoService.save(destino);
        return "redirect:/";
    }
    
    @GetMapping ("/modificarDestino/{id_destino}")
    public String modificarDestino(Destino destino, Model model){
        Destino respuesta = destinoService.getDestino(destino);
        model.addAttribute("destino", respuesta);
        return "modificarDestino";
    }
    
    @GetMapping ("/eliminarDestino/{id_destino}")
    public String eliminarDestino(Destino destino){
        destinoService.delete(destino);
        return "redirect:/";
    }
    
    
}
