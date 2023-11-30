package model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Eventos {
    @Id
    private Integer id;
    private String nombre;
    private String fecha_final;
    private double latlng;

    private String organizador;
    private String descripcion;

    private String local;


    // Getters y Setters

    public double getLatlng() {
        return latlng;
    }

    public void setLatlng(double latlng) {
        this.latlng = latlng;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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


    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }



    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}


