package com.Tarea1.Tarea1.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
//import lombok.Generated;

@Data
@Entity
@Table(name = "destino")

public class Destino implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id_destino;
    private String nombre;
    private String pais;
    private String ciudad;
    private String precio;
    private String descripcion;

    public Destino() {
    }

    public Destino(long id_destino, String nombre, String pais, String ciudad, String precio, String descripcion) {
       // this.id_destino = id_destino;
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

}
