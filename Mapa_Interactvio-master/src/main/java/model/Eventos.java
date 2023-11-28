package model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Eventos {
    @Id
    private Integer id;
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_final;
    private int hora_inicio;
    private int hora_final;

    private String organizador;
    private String descripcion;
    private char estado;
    private char contacto;
    private String correo_contacto;
    private char contacto_pais;

    // Relación many-to-one con Categoria
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    // Relación many-to-one con Departamentos
    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamentos departamento;

    // Relación many-to-one con Local
    @ManyToOne
    @JoinColumn(name = "id_local")
    private Local local;

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_final() {
        return hora_final;
    }

    public void setHora_final(int hora_final) {
        this.hora_final = hora_final;
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

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public char getContacto() {
        return contacto;
    }

    public void setContacto(char contacto) {
        this.contacto = contacto;
    }

    public String getCorreo_contacto() {
        return correo_contacto;
    }

    public void setCorreo_contacto(String correo_contacto) {
        this.correo_contacto = correo_contacto;
    }

    public char getContacto_pais() {
        return contacto_pais;
    }

    public void setContacto_pais(char contacto_pais) {
        this.contacto_pais = contacto_pais;
    }
}
