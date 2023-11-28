package model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="Usuario")
@NamedQueries({
        @NamedQuery(name="Usuario.all",query="select e from Usuario e ")
})
public class Usuario {

    @Id
    private Integer id;
    private String nom;
    private String nom2;
    private String apellido;
    private String apellido2;
    private String user_name;
    private int cif;
    private String correo_user;
    private Date fecha_user;
    private String contra;

    // Relación one-to-many con Comentarios
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Comentarios> comentarios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom2() {
        return nom2;
    }

    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getCorreo_user() {
        return correo_user;
    }

    public void setCorreo_user(String correo_user) {
        this.correo_user = correo_user;
    }

    public Date getFecha_user() {
        return fecha_user;
    }

    public void setFecha_user(Date fecha_user) {
        this.fecha_user = fecha_user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }

    public Usuario() {
    }

}

