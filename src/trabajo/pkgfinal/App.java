/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.pkgfinal;

import Clases.Alumno;
import Clases.Facultad;
import Clases.Sistema;
import Clases.Usuario;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cubas
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("\n\nProbando Sistema");
        
         Date fechatest;
         Usuario usuario;
         Alumno alumnotest;
         Facultad facultadtest;
         
         
         String codigo;
         String contraseña;
         
         
         
         Sistema sistema;
         
         
         
         System.out.println("Ingrese su codigo: ");
         codigo = teclado.nextLine();      
         System.out.println("Ingrese su contraseña: ");
         contraseña = teclado.nextLine();
  
         facultadtest = new Facultad("FISI");
                     
         alumnotest = new Alumno(66666,"eldestructor.com", contraseña, "Pepito Juan", "Perez Godoy",codigo, facultadtest);
    
        if(alumnotest.logearse(codigo,contraseña)==true){
            
            System.out.println("El alumno esta registrado");
            System.out.println(alumnotest);
            
        }
            
        
        //Comentario para comprobar el github
        
        
    }
    
}
