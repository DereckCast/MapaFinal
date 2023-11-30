package model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Eventos {
    @Id
    private Integer id;
    private String nombre;


    // Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }





}


