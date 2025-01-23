package org.zabalburu.daw1.gestoreventos.servicio;

import java.util.List;
import org.zabalburu.daw1.gestoreventos.dao.EventosDAO;
import org.zabalburu.daw1.gestoreventos.dao.EventosList;
import org.zabalburu.daw1.gestoreventos.dao.PersonaDAO;
import org.zabalburu.daw1.gestoreventos.modelo.Evento;

public class EventosServicio {

    

    private EventosDAO dao = new EventosList();
    private PersonaDAO dao = new EventosMatriz();
    
    public void añadirEvento(Evento nuevo){
        dao.añadirEvento(nuevo);
    }
    
    public void eliminarEvento(int idEvento){
        dao.eliminarEvento(idEvento);
    }

    public Evento modificarEvento(int idEvento){
        return dao.modificarEvento(idEvento);
    }
    
    public Evento buscarEvento(String descripcion){
        return dao.buscarEvento(descripcion);
    }
    public Evento buscarEvento(int idEvento){
        return dao.buscarEvento(idEvento);
    }

    public List<Evento> getEventos(){
        return dao.getEventos();
    }
  
    /*
    public void apuntarPersonaAEvento(int idEvento, Persona persona){
        dao.apuntarPersonaAEvento(idEvento, persona);
    }

    public void desapuntarPersonaDeEvento(int id, int idEvento){
        dao.desapuntarPersonaDeEvento(id, idEvento);
    }
    
    public List<Persona> getPersonasPorEvento(int idEvento) {
        return dao.getPersonasEvento(idEvento);
    }*/
}
