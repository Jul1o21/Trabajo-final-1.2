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
    private int canttickets = 0;

    public CabeceraTicket(int canttickets, Nivel nivel, Turno turno, Alimento alimento, Fecha fecha) {
        this.indice = 0;
        this.TicketA = new Ticket[canttickets];

        for (int i = 0; i < canttickets; i++) {
            Ticket tickettemp;
            EstadoTicket estadotictemp;
            estadotictemp = new EstadoTicket("ticket disponible");
            tickettemp = new Ticket(null, 20, 20, 20, estadotictemp);
            this.TicketA[i] = tickettemp;
            this.canttickets++;

        }

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

    public void asignarticketalumno(Alumno alumno) {
        boolean ticketasignado=false;
        //this.TicketA[3].setAlumno(alumno);
        for (int i = 0; i < TicketA.length; i++) {
            if(this.TicketA[i].getAlumno()==null&&ticketasignado==false){
                 this.TicketA[i].setAlumno(alumno);
                 ticketasignado=true;
            }
            
           
        }
        

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
