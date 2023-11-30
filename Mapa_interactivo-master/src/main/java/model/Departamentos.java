
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


