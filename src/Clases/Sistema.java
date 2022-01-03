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
    public static int racionestotalesporturno=20;
    private ArregloFecha fechasSistema;
    private ArregloTurno turnosSistema;
    private ArregloAlumnos alumnosRegistrados;

    public Sistema(boolean estadohabilitado, ArregloFecha fechasSistema, ArregloTurno turnosSistema, ArregloAlumnos alumnosRegistrados) {
        this.estadohabilitado = estadohabilitado;
        this.fechasSistema = fechasSistema;
        this.turnosSistema = turnosSistema;
        this.alumnosRegistrados = alumnosRegistrados;
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
    
    

    public void setEstadohabilitado(boolean estadohabilitado) {
        this.estadohabilitado = estadohabilitado;
    }

    public static void setRacionestotalesporturno(int racionestotalesporturno) {
        Sistema.racionestotalesporturno = racionestotalesporturno;
    }
    
    
}   
