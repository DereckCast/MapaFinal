package beans;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import model.Eventos;
import model.Usuario;
import org.primefaces.PrimeFaces;
import org.primefaces.model.DialogFrameworkOptions;
import service.IDAO;
import service.ImplIDAO;

import java.io.Serializable;

@Named
@ViewScoped
@Getter
@Setter
public class EventoBean implements Serializable {
    private IDAO dao = new ImplIDAO();

    @Getter
    private Eventos eventos = new Eventos();

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }
    public void guardarEvento(){

    }
    public void viewProducts(){
        DialogFrameworkOptions options = DialogFrameworkOptions.builder()
                .resizable(false)
                .modal(true)
                .build();

        PrimeFaces.current().dialog().openDynamic("form", options, null);
    }

}