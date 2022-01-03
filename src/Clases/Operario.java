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

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }
    
    public void RegistrarAlumno(Alumno alumno){
       
    }
    @Override
    public String toString() {
        return "Operario{" + "entrada=" + entrada + '}';
    }
    
    
}
