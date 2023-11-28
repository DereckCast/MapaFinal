package beans;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import model.Eventos;
import service.EventService;
import service.IDAO;
import service.ImplIDAO;

import java.io.Serializable;
import java.util.List;


@Named("beanEvento")
@ViewScoped
@Getter
@Setter
public class BeanEvento implements Serializable {

    @Inject
    private EventService eventService;

    private List<Eventos> eventos;

    private Eventos selectedEvent;

    @PostConstruct
    public void init() {
        eventos = eventService.getEventos(); // Recupera la lista de eventos al iniciar
    }



}


