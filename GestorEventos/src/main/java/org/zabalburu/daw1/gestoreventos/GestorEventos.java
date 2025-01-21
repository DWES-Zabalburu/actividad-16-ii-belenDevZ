/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.gestoreventos;

import java.text.DateFormat;
import java.text.NumberFormat;
import org.zabalburu.daw1.gestoreventos.servicio.EventosServicio;

/**
 *
 * @author belenbelenare
 */
public class GestorEventos {
    
    private static EventosServicio servicio = new EventosServicio();
    private static DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
    private static NumberFormat nf = NumberFormat.getInstance();
    private static NumberFormat nfMoneda = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        

    }
}
