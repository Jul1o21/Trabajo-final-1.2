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
public class Sistema {

    private boolean estadohabilitado;
    public static int racionestotalesporturno = 5;
    private ArregloFecha fechasSistema;
    private ArregloTurno turnosSistema;
    private ArregloAlumnos alumnosRegistrados;
    private CabeceraTicket ticketscreadosconfecha;
    private Operario operario;

    public Sistema(boolean estadohabilitado, ArregloFecha fechasSistema, ArregloTurno turnosSistema, ArregloAlumnos alumnosRegistrados, Operario operario) {
        this.estadohabilitado = estadohabilitado;
        this.fechasSistema = fechasSistema;
        this.turnosSistema = turnosSistema;
        this.alumnosRegistrados = alumnosRegistrados;
        this.operario = operario;
        this.ticketscreadosconfecha = null;
    }

    public void setTicketscreadosconfecha(CabeceraTicket ticketscreadosconfecha) {
        this.ticketscreadosconfecha = ticketscreadosconfecha;
    }

    public ArregloFecha getFechasSistema() {
        return fechasSistema;
    }

    public ArregloTurno getTurnosSistema() {
        return turnosSistema;
    }

    public ArregloAlumnos getAlumnosRegistrados() {
        return alumnosRegistrados;
    }

    public static int getRacionestotalesporturno() {
        return racionestotalesporturno;
    }

    public void asignarTicket(Alumno alumno) {
        if(this.ticketscreadosconfecha==null){
            System.out.println("NO HAY TICKETS DISPONIBLES EN EL SISTEMA");
        }
        else {
            this.ticketscreadosconfecha.asignarticketalumno(alumno);
        }
        

    }

    public CabeceraTicket getTicketscreadosconfecha() {
        return ticketscreadosconfecha;
    }

    public void setEstadohabilitado(boolean estadohabilitado) {
        this.estadohabilitado = estadohabilitado;
    }

    public static void setRacionestotalesporturno(int racionestotalesporturno) {
        Sistema.racionestotalesporturno = racionestotalesporturno;
    }

    public boolean validarlogdeoperario(String codigoop, String contrasenaop) {
        boolean result = false;
        if (this.operario.getCodigo().equals(codigoop) && this.operario.getContraseña().equals(contrasenaop)) {
            result = true;

        }

        return result;
    }
}
