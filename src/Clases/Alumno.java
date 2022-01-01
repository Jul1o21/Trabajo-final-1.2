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
public class Alumno extends Usuario {
    private int DNI;
    private String correo;
    private Facultad facultad; 
    

    public Alumno(int DNI, String correo, String contrasena, String nombres, String apellidos, String codigo, Facultad facultad) {
            
            super(contrasena, nombres, apellidos, codigo);
            this.DNI = DNI;
            this.correo = correo;
            this.facultad = facultad;
        
        
    }

    public int getDNI() {
        return DNI;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "DNI=" + DNI + ", correo=" + correo + ", contraseña="+ this.getContraseña()+", codigo=" + this.getCodigo() + ", apellidos=" + this.getApellidos() + ", nombres=" + this.getNobmres()+ '}';
    }
    
    
}
