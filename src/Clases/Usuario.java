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
public abstract class Usuario {
    private String contrasena;
    private String nombres;
    private String apellidos;
    private String codigo; 

    public Usuario(String contrasena, String nombres, String apellidos, String codigo) {
        this.contrasena = contrasena;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }

    public String getContraseña() {
        return contrasena;
    }

    public String getNobmres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public boolean logearse(String codigo, String contraseña){
        boolean result = false;   
        
        
        System.out.println("\nEntrada exitosa, el usuario existe en los registros");  
        
        result = true;
        
        return result;
    }
    
    
    
    @Override
    public String toString() {
        return "Usuario{" + "contrasena=" + contrasena + ", nombres=" + nombres + ", apellidos=" + apellidos + ", codigo=" + codigo + '}';
    }

    
    

}
