/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestoreventos.dao;

import java.util.GregorianCalendar;
import org.zabalburu.daw1.gestoreventos.dao.PersonaDAO;
import org.zabalburu.daw1.gestoreventos.modelo.Persona;

/**
 *
 * @author belensexpeare
 */
public class PersonaMatriz implements PersonaDAO{
    


    private static Persona[] personas = new Persona[100];
    private static int numPersonas = 0;
    /* se podria calcular automaticamente la edad y que en la propia matriz saliera true o false??*/
    public PersonaMatriz(){
        nuevaPersona(new Persona(0, "11111111A","Juan", "López",new GregorianCalendar(2000, 10, 24).getTime(), true));
        nuevaPersona(new Persona(0, "22222222B","Ekaitz", "LLanos",new GregorianCalendar(2008, 11, 14).getTime(),false));
        nuevaPersona(new Persona(0, "33333333C","Maria", "Muna",new GregorianCalendar(1999, 4, 6).getTime(),true));
        nuevaPersona(new Persona(0, "44444444D","Selena", "Gómez",new GregorianCalendar(1996, 3, 9).getTime(),true));
        nuevaPersona(new Persona(0, "55555555E","Sabrina", "Carpenter",new GregorianCalendar(2000, 8, 16).getTime(),true));
        nuevaPersona(new Persona(0, "66666666F","Charli", "Equides",new GregorianCalendar(1998, 1, 22).getTime(),true));
        nuevaPersona(new Persona(0, "77777777G","Chappel", "Roan",new GregorianCalendar(2002, 10, 30).getTime(),true));
        nuevaGasto(1, new Gasto("Comida", new GregorianCalendar(2024, 10, 24).getTime(), 30));
        nuevoGasto(1, new Gasto("Alojamiento", new GregorianCalendar(2024, 10, 23).getTime(), 89.75));
        nuevoGasto(1, new Gasto("Transporte", new GregorianCalendar(2024, 10, 23).getTime(), 10.5));
        nuevoGasto(3, new Gasto("Comida", new GregorianCalendar(2024, 11, 4).getTime(), 50));
    }
/*        Persona añadirPersona(Persona nueva);
    void eliminarPersona(int id); 
    void modificarPersona(int id);
    Persona buscarPersona(int id);
    Persona buscarPersona(String dni); */
}
