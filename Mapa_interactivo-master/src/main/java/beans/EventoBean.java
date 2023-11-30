package beans;

import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import model.Eventos;
import org.primefaces.PrimeFaces;
import org.primefaces.model.DialogFrameworkOptions;
import service.IDAO;
import service.ImplIDAO;

import java.io.Serializable;

@Named("eventoBean")
@ViewScoped
@Getter
@Setter
public class EventoBean implements Serializable {
    private IDAO dao = new ImplIDAO();

    @Getter
    private Eventos eventos = new Eventos();
    private static final long serialVersionUID = 1L;

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }

    public String guardarEvento(){
        try {
            // Inserta el nuevo usuario en la base de datos
            dao.insert(eventos);

        } catch (Exception e) {
            // Manejo de excepciones y rollback
            e.printStackTrace();
            return "registro.xhtml";
        }

        return null;
    }
    public void viewProducts(){
        DialogFrameworkOptions options = DialogFrameworkOptions.builder()
                .resizable(false)
                .modal(true)
                .build();

        PrimeFaces.current().dialog().openDynamic("form", options, null);
    }
    public void guardarMarcador() {
        // Obtener el nombre del marcador del parámetro
        String nombreMarcador = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nombreMarcador");

        // Puedes hacer lo que quieras con el nombreMarcador, por ejemplo, asignarlo al atributo nombre de tu objeto Evento
        eventos.setNombre(nombreMarcador);

        dao.insert(eventos);
    }


}