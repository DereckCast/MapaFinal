package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Departamentos {
    @Id
    private Integer id;
    private String Nom_dep;

    // Relación one-to-many con Eventos
    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
    private List<Eventos> eventos;

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

    public String getNom_dep() {
        return Nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        Nom_dep = nom_dep;
    }
}
