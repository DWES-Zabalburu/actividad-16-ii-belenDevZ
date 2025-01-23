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
public class Evento {
        private static int numIdsEventos=0;
    
    private int idEvento;
    private String descripcion;
    private Date fecha;
    private String lugar;
    private Boolean isMayor18=false;
    private double coste;
    private List<Persona> personas = new ArrayList<>();

    public Evento() {
        this.idEvento = Evento.numIdsEventos;
        Evento.numIdsEventos++;
    }

    public Evento(String descripcion, Date fecha, String lugar, double coste) {
        this();
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.coste = coste;
    }

    public static int getNumIdsEventos() {
        return numIdsEventos;
    }

    public static void setNumIdsEventos(int numIdsEventos) {
        Evento.numIdsEventos = numIdsEventos;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Boolean getIsMayor18() {
        return isMayor18;
    }

    public void setIsMayor18(Boolean isMayor18) {
        this.isMayor18 = isMayor18;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idEvento;
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
        final Evento other = (Evento) obj;
        return this.idEvento == other.idEvento;
    }

    @Override
    public String toString() {
        return "Evento{" + "idEvento=" + idEvento 
                + ", descripcion=" + descripcion 
                + ", fecha=" + fecha 
                + ", lugar=" + lugar 
                + ", isMayor18=" + isMayor18 
                + ", coste=" + coste 
                + ", personas=" + personas + '}';
    }

    
    
    
}
