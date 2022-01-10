/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
    private int canttickets;

    public CabeceraTicket(int canttickets, Nivel nivel, Turno turno, Alimento alimento, Fecha fecha) {
        this.canttickets = 0;
        this.TicketA = new Ticket[canttickets];
        
        for (int i = 0; i < canttickets; i++) {
            Ticket tickettemp;
            EstadoTicket estadotictemp;
            estadotictemp = new EstadoTicket("ticket disponible");
            tickettemp = new Ticket(null, this.canttickets+1,Sistema.racionestotalesporturno-this.canttickets-1, estadotictemp);
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
                EstadoTicket estadoalum;
                 estadoalum = new EstadoTicket("con dueño");   
                 this.TicketA[i].setAlumno(alumno);
                 this.TicketA[i].setEstado(estadoalum);
                 ticketasignado=true;
            }
            
           
        }
        

    }
    
    public boolean validarticketcab(String codigo){
        boolean result=false;
        System.out.println("Se entro al validar ticket");
        
        for (int i=0;i<this.canttickets;i++){
        if(this.TicketA[i].getAlumno()!= null)   {
            if (this.TicketA[i].getAlumno().getCodigo().equals(codigo)==true) {                            
                EstadoTicket estadoval;
                estadoval = new EstadoTicket("validado");      
                this.TicketA[i].setEstado(estadoval);
                result = true;
            }
            }
        }
            
        

        return result;
    }
    public Alimento getAlimento() {
        return alimento;
    }

    public Fecha getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "\tArreglo de Tickets" +"\n"+"TicketA=" +"\n"+ Arrays.toString(TicketA) + "\n"+
                "------------------------------------------------------------------------------------"+"\n"+
                "nivel=" + nivel + "\n"+
                "turno=" + turno + "\n"+
                "alimento=" + alimento + "\n"+
                "fecha=" + fecha + "\n"+
                "----------------------------------------------------------------------------------"+"\n";
    }

}
