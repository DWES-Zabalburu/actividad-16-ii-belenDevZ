/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.gestoreventos;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.JOptionPane;
import org.zabalburu.daw1.gestoreventos.modelo.Evento;
import org.zabalburu.daw1.gestoreventos.servicio.EventosServicio;

/**
 *
 * @author belenbelenare
 */
public class GestorEventos {
    
/*    private static EventosServicio servicio = new EventosServicio();
    private static DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
    private static NumberFormat nf = NumberFormat.getInstance();
    private static NumberFormat nfMoneda = NumberFormat.getCurrencyInstance();

private static void listarEventos() {
    List<Evento> eventos = servicio.getEventos();
    String listado
            = """
        <html>
        <h3>Lista de Eventos</h3>
        <hr/>
        <table bgcolor=white border=1>
        <tr><td>ID</td><td>Nombre</td><td>Fecha</td></tr>
        """;
    for (Evento e : eventos) {
        listado
                += """
        <tr><td>%d</td><td>%s</td><td>%s</td></tr>
        """.formatted(
                        e.getIdEvento(),
                        e.getDescripcion(),
                        df.format(e.getFecha())
                );
    }
    listado += """
        </table>
        <h4>Seleccionar ID del Evento al que quieres apuntarte:</h4>
        """;
    String resp = JOptionPane.showInputDialog(listado);
    try {
        int idEvento = Integer.parseInt(resp);
        apuntarseEvento(idEvento);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null,
                "El ID debe ser un valor entero sin decimales",
                "ID Erróneo",
                JOptionPane.ERROR_MESSAGE);
    }
}
    
    public static void main(String[] args) {
        
                 // 1. Apuntarse a un Evento
                //2. Eliminar Evento
               // 3. Listar Eventos
               // 4. Salir
    }
}
