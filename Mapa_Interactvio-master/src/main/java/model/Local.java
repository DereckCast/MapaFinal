package model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Local {
    @Id
    private Integer id;
    private char departamento;
    private float latitud;
    private float longitud;
    private char municipio;
    private String nombre;

    // Relación one-to-many con Eventos
    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<Eventos> eventos;

    // Resto de los métodos getter y setter

    public List<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(List<Eventos> eventos) {
        this.eventos = eventos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public char getDepartamento() {
        return departamento;
    }

    public void setDepartamento(char departamento) {
        this.departamento = departamento;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public char getMunicipio() {
        return municipio;
    }

    public void setMunicipio(char municipio) {
        this.municipio = municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}