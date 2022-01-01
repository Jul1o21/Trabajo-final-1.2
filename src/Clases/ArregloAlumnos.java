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
public class ArregloAlumnos {
    private Alumno AlumnoA[];
    private int indice;

    public ArregloAlumnos(int cantidadalumnos) {
        
        this.indice = 0;
        this.AlumnoA = new Alumno[cantidadalumnos];
    }

    public Alumno[] getAlumnoA() {
        return AlumnoA;
    }

    public int getIndice() {
        return indice;
    }
    
    public boolean agregarAlumno(){
        boolean result=false;
        
        result=true;
        return result;
    }
    
    @Override
    public String toString() {
        return "ArregloAlumnos{" + "AlumnoA=" + Arrays.toString(AlumnoA) + ", indice=" + indice + '}';
    }
    
    
}
