package beans;

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
    public String guardarMarcador (){
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


}