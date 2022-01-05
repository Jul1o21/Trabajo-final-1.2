/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author cubas
 */
public class Ticket {
    private Alumno alumno;
    private int numeroticket;
    private int contadorticket;
    private int stockalmuerzo;
    private EstadoTicket estado;

    //

    public Ticket(Alumno alumno, int numeroticket, int contadorticket, int stockalmuerzo, EstadoTicket estado) {
        this.alumno = alumno;
        this.numeroticket = numeroticket;
        this.contadorticket = contadorticket;
        this.stockalmuerzo = stockalmuerzo;
        this.estado = estado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getNumeroticket() {
        return numeroticket;
    }

    public int getContadorticket() {
        return contadorticket;
    }

    public int getStockalmuerzo() {
        return stockalmuerzo;
    }

    public EstadoTicket getEstado() {
        return estado;
    }

    public void setEstado(EstadoTicket estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ticket{" + "alumno=" + alumno + ", numeroticket=" + numeroticket + ", contadorticket=" + contadorticket + ", stockalmuerzo=" + stockalmuerzo + ", estado=" + estado + '}';
    }
    
    
    
    
}
