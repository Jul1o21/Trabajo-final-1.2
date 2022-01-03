/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Arrays;

/**
 *
 * @author cubas
 */
public class CabeceraTicket { //Arreglo de Tickets
    private Ticket TicketA[];
    private Nivel nivel;
    private Turno turno;
    private Alimento alimento;
    private Fecha fecha;
    private int indice;
    
    
    public CabeceraTicket(int canttickets, Nivel nivel, Turno turno, Alimento alimento, Fecha fecha) {
        this.indice = 0;
        this.TicketA = new Ticket[canttickets];
        this.nivel = nivel;
        this.turno = turno;
        this.alimento = alimento;
        this.fecha = fecha;
    }

    public Ticket[] getTicketA() {
        return TicketA;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public Turno getTurno() {
        return turno;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public Fecha getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "CabeceraTicket{" + "TicketA=" + Arrays.toString(TicketA) + ", nivel=" + nivel + ", turno=" + turno + ", alimento=" + alimento + ", fecha=" + fecha + '}';
    }
    
    
         
}
