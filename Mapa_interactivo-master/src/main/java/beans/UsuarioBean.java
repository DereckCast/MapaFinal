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
            return "evento.xhtml";
        } catch (Exception e) {
            // Manejo de excepciones y rollback
            e.printStackTrace();
            return "evento.xhtml";
        }
    }
    public String redirectInicio() {
        try {
            // Buscar el usuario en la base de datos
            List<Usuario> usuarios = dao.getAll("Usuario.findByUsernameAndPassword", Usuario.class, inputNomUsuario, inputContrasenia);

            if (!usuarios.isEmpty()) {
                // Usuario encontrado, redirigir a la página evento.xhtml
                return "evento.xhtml";
            } else {
                // Usuario no encontrado, mostrar mensaje de datos incorrectos
                return "datosIncorrectos.xhtml";  // Reemplaza "datosIncorrectos.xhtml" con la página que desees mostrar el mensaje de datos incorrectos
            }
        } catch (Exception e) {
            // Manejo de excepciones
            e.printStackTrace();
            return "login.xhtml";  // Reemplaza "error.xhtml" con la página que desees mostrar en caso de error
        }
    }


}
