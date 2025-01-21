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
    
    void nuevoEvento(Evento nuevo);
    Evento getEvento(int codigo);
    void eliminarEvento(int codigo);
    List<Persona> getPersona();
    
}
