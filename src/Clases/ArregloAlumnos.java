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
    
    public boolean agregarAlumno(Alumno alumno){
        boolean result=false;
        
        
        this.AlumnoA[this.indice] = alumno;  
        this.indice++;
        result= true;
        
        
        return result;
        
        
        /*
        */
    }
    public boolean verificaralumno(String contrasena,String codigo){
        boolean result=false;
          for (int i=0;i<this.indice;i++){
            if (this.AlumnoA[i].getCodigo().equals(codigo)&&this.AlumnoA[i].getContraseña().equals(contrasena)){
                result = true;
                
                break;
            }               
        }
            return result;
    }
    
    public Alumno devolveralumno(String codigo){
        Alumno result=null; 
        for (int i=0;i<this.indice;i++){
            if (this.AlumnoA[i].getCodigo().equalsIgnoreCase(codigo)){
                result = AlumnoA[i];
                break;
            }               
        }
        return result;
    }
    
    @Override
    public String toString() {
        return "ArregloAlumnos{" + "AlumnoA=" + Arrays.toString(AlumnoA) + ", indice=" + indice + '}';
    }
    
    
}
