package beans;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named("usuarioBean")
@ViewScoped
@Getter
@Setter
public class usuarioBean {

    private String nombres;
    private String apellido;
    private String usuario;
    private String cif;
    private String correo;
    private String contrasenia;

    public void redirectInicio(){

    }


}
