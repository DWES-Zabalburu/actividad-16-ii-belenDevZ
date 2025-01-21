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

//CRUD
public interface PersonaDAO {
    void nuevoPersona(Persona nuevo); 
    Persona getPersona(int id); 
    void eliminarPersona(int id); 
    List<Evento> getEventosPersona(int id); 
    void apuntarEvento(int id, Evento evento); 
    void desapuntarEvento(int id, int idEvento); 
    
}
