package org.zabalburu.daw1.gestoreventos.servicio;

import java.util.List;
import org.zabalburu.daw1.gestoreventos.dao.EventosDAO;
import org.zabalburu.daw1.gestoreventos.dao.EventosList;
import org.zabalburu.daw1.gestoreventos.modelo.Evento;
import org.zabalburu.daw1.gestoreventos.modelo.Persona;

public class EventosServicio {

    private EventosDAO dao = new EventosList();
    
    public void nuevoEvento(Evento nuevo){
        dao.nuevoEvento(nuevo);
    }

    public Evento getEvento(int idEvento){
        return dao.getEvento(idEvento);
    }
    
    public List<Evento> getEventos(){
        return dao.getEventos();
    }
    
    public void eliminarEvento(int idEvento){
        dao.eliminarEvento(idEvento);
    }

    public void apuntarPersonaAEvento(int id, int idEvento){
        dao.apuntarPersonaAEvento(id, idEvento);
    }

    public void desapuntarPersonaDeEvento(int id, int idEvento){
        dao.desapuntarPersonaDeEvento(id, idEvento);
    }
    
    public List<Persona> getPersonasPorEvento(int idEvento) {
        return dao.getPersonasEvento(idEvento);
    }
}
