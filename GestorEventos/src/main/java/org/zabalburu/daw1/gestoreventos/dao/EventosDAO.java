/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.gestoreventos.dao;

import java.util.List;
import org.zabalburu.daw1.gestoreventos.modelo.Evento;
import org.zabalburu.daw1.gestoreventos.modelo.Persona;

/**
 *
 * @author belensexpeare
 */
public interface EventosDAO {
    
    //GESTION CON MATRICES
    
        /* 
        deberiamos poder:
            añadir evento
            eliminar evento
            modificar evento
            buscar evento por ID
            buscar evento por nombre
        */
    
    void añadirEvento(Evento nuevo);
    void eliminarEvento(int idEvento); 
    void modificarEvento(Evento evento);
    List<Evento> getEventos();
    Evento getEvento(int idEvento);
    ////
    void apuntarPersonaAEvento(int idEvento, Persona persona);
    void desapuntarPersonaDeEvento(int idEvento, int idPersona);
    List<Persona> getPersonasEvento(int idEvento);
    
}
