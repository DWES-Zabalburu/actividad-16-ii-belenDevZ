/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestoreventos.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author belenbelenare
 */
public class Persona {
    
    private static int numIds=1;
    
    private int id;
    private String dni;
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private Boolean esMayor18=false;
    private String password;
    private List<Evento> eventos = new ArrayList<>();

    public Persona() {
        this.id = Persona.numIds;
        numIds++;

    }

    public Persona(int id, String dni, String nombre, String apellidos, Date fechaNacimiento, String password) {
        this();
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
    }
    
    

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    

    public static int getNumIds() {
        return numIds;
    }

    public static void setNumIds(int numIds) {
        Persona.numIds = numIds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
        public Boolean getEsMayor18() {
        return esMayor18;
    }

    public void setEsMayor18(Boolean esMayor18) {
        this.esMayor18 = esMayor18;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Persona{" 
                + "id=" + id 
                + ", dni=" + dni 
                + ", nombre=" + nombre 
                + ", apellidos=" + apellidos 
                + ", eventos=" + eventos + '}';
    }
    
    
    
}
