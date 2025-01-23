/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestoreventos.dao;

import java.util.GregorianCalendar;
import org.zabalburu.daw1.gestoreventos.modelo.Persona;

/**
 *
 * @author belensexpeare
 */
public class PersonaMatriz implements PersonaDAO{
    
    private static Persona[] personas = new Persona[100];
    private static int numPersonas = 0;
    
    public PersonaMatriz(){
        nuevaPersona(new Persona(0, "11111111A","Juan", "López",new GregorianCalendar(2000, 10, 24).getTime(), true));
        nuevaPersona(new Persona(0, "22222222B","Ekaitz", "LLanos",new GregorianCalendar(2008, 11, 14).getTime(),false));
        nuevaPersona(new Persona(0, "33333333C","Maria", "Muna",new GregorianCalendar(1999, 4, 6).getTime(),true));
        nuevaPersona(new Persona(0, "44444444D","Selena", "Gómez",new GregorianCalendar(1996, 3, 9).getTime(),true));
        nuevaPersona(new Persona(0, "55555555E","Sabrina", "Carpenter",new GregorianCalendar(2000, 8, 16).getTime(),true));
        nuevaPersona(new Persona(0, "66666666F","Charli", "Equides",new GregorianCalendar(1998, 1, 22).getTime(),true));
        nuevaPersona(new Persona(0, "77777777G","Chappel", "Roan",new GregorianCalendar(2002, 10, 30).getTime(),true));
    
        
    }
    
    @Override
    public Persona añadirPersona(Persona nueva) {
       if(numPersonas<personas.length){
           personas[numPersonas]=nueva;
           numPersonas++;
       }
       return nueva;
    }
    
    @Override
    public void eliminarPersona(int id){
    //buscar la posicion de al persona con el id recibido
    //busqueda desordenada!!!!!!!!
    int i = getPersonaById(id);
    
    if (i!=-1){
        //mover los elementos desde i+1 desde una posicion a la izq
        for(i=+1; i<numPersonas; i++){
            personas[i-1] =personas[i];
        }
        //tenemos unas persona menos
        numPersonas--;
    }
    
    @Override
    public void modificarPersona(Persona modificar){
        //buscamos la posicion de la persona con ese id
        int pos = getPersonaById(modificar.getId());
        if (pos !=-1){
            personas[pos]=modificar;
        }
    }
    
    
    
    //voy a haceer un metodobuscar para reciclar el metodo eliminar persona
    private int getPersonaById(int id){
    int i;
    for(i=0; i<numPersonas && id!=personas[i].getId();i++);
        if (i<numPersonas){
            return i;
        }else {
            return -1;
        }
    } 
    
    
    /*Persona añadirPersona(Persona nueva);
    void eliminarPersona(int id); 
    void modificarPersona(int id);
    Persona buscarPersona(int id);
    Persona buscarPersona(String dni);*/
    }
}
