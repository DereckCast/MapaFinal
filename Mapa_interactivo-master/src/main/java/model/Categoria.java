package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {

    @Id
    private Integer id;
    private String nombre;


    public Categoria() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}


