package service;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import model.Eventos;

import java.util.List;

@Named
@ApplicationScoped
public class EventService {
    private List<Eventos> eventos;

    public List<Eventos> getEventos() {
        return eventos;
    }

    public void setProducts(List<Eventos> products) {
        this.eventos = eventos;
    }

    @PostConstruct
    public void init(){

    }
}
