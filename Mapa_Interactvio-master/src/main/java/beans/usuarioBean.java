package beans;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import model.Autor;
import service.IDAO;
import service.ImplIDAO;

import java.io.Serializable;
import java.util.List;

@Named("usuarioBean")
@ViewScoped
@Getter
@Setter
public class usuarioBean implements Serializable {

    private IDAO dao = new ImplIDAO();
    private String nombres;
    private String apellido;
    private String usuario;
    private String cif;
    private String correo;
    private String contrasenia;

    // Constructor y getters/setters

    public String redirectMapa() {
        // Lógica para el redireccionamiento después del registro
        return "mapa.xhtml"; // Cambia esto según tus necesidades
    }
    public void redirectInicio(){

    }

}
