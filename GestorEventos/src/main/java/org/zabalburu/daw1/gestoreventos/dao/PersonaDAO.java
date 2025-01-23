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
    //GESTION CON MATRICES
    /* 
        deberiamos poder:
            añadir persona
            eliminar persona
            modificar persona
            buscar persona por ID
            buscar persona por DNI
    
    lo ideal seria hacer una expresion regular para comprobar 
    el DNI pero seria complicado*/
    
    Persona añadirPersona(Persona nueva);
    void eliminarPersona(int id);
    void modificarPersona(Persona modificar);
    List<Evento> getPersonas();
    Persona getPersona(int id);
    Persona getPersona(String dni);

   
}
