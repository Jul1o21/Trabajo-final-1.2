/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cubas
 */
public class Operario extends Usuario {
    private Date entrada;

    public Operario(Date entrada, String contrasena, String nombres, String apellidos, String codigo) {
        super(contrasena, nombres, apellidos, codigo);
        this.entrada = entrada;
    }

    public Operario(String contrasena, String codigo) { //Esto se usara para verificar si el operario esta registrado
        super(contrasena, codigo);
    }
    
    
    public Date getEntrada() {
        return entrada;
    }
    
    public void cambiarracionesporturno(int nuevacantidad){
        Sistema.racionestotalesporturno = nuevacantidad;
        
    }
    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }
    
    public Fecha crearfechaparatickets(){ //Parte donde el operario crea la clase fecha
        
        Date fechadate;
        fechadate = new Date();   
        boolean estado=false;
        if(fechadate.getHours()>7&&fechadate.getHours()<=8){
               estado=true;        
               System.out.println("Se le asigna true al estado de la fecha");
        }

        
        Fecha fechacreada; //Clase 
        fechacreada = new Fecha(fechadate, estado);       
        System.out.println("Se creo la clase Fecha ");  
        
        System.out.println(fechacreada);
        
        
        return fechacreada;
        
      
    }
    public void RegistrarAlumno(Alumno alumno, ArregloAlumnos alumnos){
       
       alumnos.agregarAlumno(alumno);
       
    }
    
    
    @Override
    public String toString() {
        return "Operario{" + "entrada=" + entrada + "contraseña="+ this.getContraseña()+", codigo=" + this.getCodigo() + ", apellidos=" + this.getApellidos() + ", nombres=" + this.getNobmres()+'}';
    }
    
    
}
