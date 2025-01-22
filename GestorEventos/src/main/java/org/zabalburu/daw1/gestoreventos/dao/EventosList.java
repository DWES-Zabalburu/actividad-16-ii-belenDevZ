package org.zabalburu.daw1.gestoreventos.dao;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.gestoreventos.modelo.Evento;
import org.zabalburu.daw1.gestoreventos.modelo.Persona;

public class EventosList implements EventosDAO {

    private List<Evento> eventos;

    public EventosList() {
        this.eventos = new ArrayList<>();
    }

    @Override
    public void nuevoEvento(Evento nuevo) {
        eventos.add(nuevo);
    }

    @Override
    public Evento getEvento(int idEvento) {
        for (Evento e : eventos) {
            if (e.getIdEvento()== idEvento) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void eliminarEvento(int idEvento) {
        for (int i = 0; i < eventos.size(); i++) {
              if (eventos.get(i).getIdEvento() == idEvento) {
                eventos.remove(i);
                break;
            }
        }
    }

/*
    @Override
    public List<Evento> getEventos() {
        return new ArrayList<>(eventos);
    }

    @Override
    public void apuntarPersonaAEvento(int idEvento, Persona persona) {
        Evento evento = getEvento(idEvento);
        if (evento != null) {
            evento.getPersonas().add(persona);
        }
    }

    @Override
    public void desapuntarPersonaDeEvento(int idEvento, int id) {
        Evento evento = getEvento(idEvento);
        if (evento != null) {            
            for (int i = 0; i < evento.getPersonas().size(); i++) {
                if (evento.getPersonas().get(i).getId() == id) {
                    evento.getPersonas().remove(i);
                    break;
                }
             }
      }
    }

    @Override
        public List<Persona> getPersonasEvento(int idEvento) {
            Evento evento = getEvento(idEvento);
            if (evento != null) {
                return new ArrayList<>(evento.getPersonas());
            }
            return new ArrayList<>();
        }
        */
    }
