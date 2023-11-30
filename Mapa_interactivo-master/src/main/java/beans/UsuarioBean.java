package beans;


import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import model.Usuario;
import service.IDAO;
import service.ImplIDAO;

import java.io.Serializable;
import java.util.List;

@Named("UsuarioBean")
@ViewScoped
@Getter
@Setter
public class UsuarioBean implements Serializable {

    private IDAO dao = new ImplIDAO();
    @Getter
    private Usuario usuario = new Usuario();  // Usa la nueva entidad Usuario
    private String inputNomUsuario; // Nuevo campo para el nombre de usuario del formulario
    private String inputContrasenia;


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String redirectMapa() {
        try {
            // Inserta el nuevo usuario en la base de datos
            dao.insert(usuario);
            return "evemto.xhtml";
        } catch (Exception e) {
            // Manejo de excepciones y rollback
            e.printStackTrace();
            return "registro.xhtml";
        }
    }
    // En la clase UsuarioBean
    public String redirectInicio() {
        List<Usuario> usuarios = dao.get("findByNomUsuarioAndContrasenia", Usuario.class, inputNomUsuario, inputContrasenia);

        if (!usuarios.isEmpty()) {
            // Usuario autenticado, puedes redirigir a la página deseada
            return "mapa.xhtml";
        } else {

            return "home.xhtml";
        }
    }

}
