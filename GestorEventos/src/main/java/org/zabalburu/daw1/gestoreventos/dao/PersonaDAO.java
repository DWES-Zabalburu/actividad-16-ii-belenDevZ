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
public interface PersonaDAO {
     void nuevoPersona(Persona nuevo);
    Persona getPersona(int codigo);
    void eliminarPersona(int codigo);
    List<Persona> getPersona();
    void nuevoEvento(int idEvento, Evento nuevo);
    void eliminarEvento(int idEvento, int num);
    
}
