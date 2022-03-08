package com.Tarea1.Tarea1.controller;

import com.Tarea1.Tarea1.service.DestinoService;
import com.Tarea1.Tarea1.domain.Destino;
import java.util.Arrays;
import java.util.List;
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
    private DestinoService destinoService;

    @RequestMapping("/")
    public String inicio(Model model) {
        log.info("utilizando...");
        var destinosDB = destinoService.getDestino();
        model.addAttribute("destinosDB", destinosDB);
        return "index";
    }

    @GetMapping("/nuevoDestino")
    public String nuevoDestino(Destino destino) {
        return "modificarDestino";
    }

    /*@GetMapping("/destinos") // deberia printar la table DB
    public List<Destino> destinos(Destino destino) {
        var destinosDB = destinoService.getDestino();
        model.addAttribute("destinosDB", destinosDB);
        return (List<Destino>)destinoDao.findAll();
    }*/
    
    // CONTACTENOS CONTACTENOS CONTACTENOS
    @GetMapping("/contacto") 
    public String contacto(Destino destino) {
        return "/contacto";
    }
    // CONTACTENOS CONTACTENOS CONTACTENOS
    
    @PostMapping("/guardarDestino")
    public String guardarDestino(Destino destino) {
        destinoService.save(destino);
        return "redirect:/";
    }

    @GetMapping("/modificarDestino/{id_destino}")
    public String modificarDestino(Destino destino, Model model) {
        Destino respuesta = destinoService.getDestino(destino);
        model.addAttribute("destino", respuesta);
        return "modificarDestino";
    }

    @GetMapping("/eliminarDestino/{id_destino}")
    public String eliminarDestino(Destino destino) {
        destinoService.delete(destino);
        return "redirect:/";
    }

}
