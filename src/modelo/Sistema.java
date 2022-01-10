/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cubas
 */
public class Sistema {

    private boolean estadohabilitado;
    public static int racionestotalesporturno = 3;
    public static int turnospordia = 8;
    public static int intervaloinferior=21;
    public static int intervalosuperior=22;
    private ArregloFecha fechasSistema;
    private ArregloTurno turnosSistema;
    private ArregloAlumnos alumnosRegistrados;
    private ArregloCabeceras cabecerascreadasconfecha;
    private Operario operario;
    private int indice;

    public Sistema(boolean estadohabilitado, ArregloFecha fechasSistema, ArregloTurno turnosSistema, ArregloAlumnos alumnosRegistrados, Operario operario) {
        this.indice = 0;
        this.estadohabilitado = estadohabilitado;
        this.fechasSistema = fechasSistema;
        this.turnosSistema = turnosSistema;
        this.alumnosRegistrados = alumnosRegistrados;
        this.operario = operario;
        this.cabecerascreadasconfecha = new ArregloCabeceras();

    }

    public void setTicketscreadosconfecha(CabeceraTicket ticketscreadosconfecha) {
        
       this.cabecerascreadasconfecha.agregarticketscreadosconfecha(ticketscreadosconfecha);

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
        this.cabecerascreadasconfecha.asignarTicketCabeceras(alumno);

    }

    public ArregloCabeceras getTicketscreadosconfecha() {
        return cabecerascreadasconfecha;
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
