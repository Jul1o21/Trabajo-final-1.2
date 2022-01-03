/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.pkgfinal;

import Clases.Alumno;
import Clases.ArregloAlumnos;
import Clases.ArregloFecha;
import Clases.ArregloTurno;
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
        
         Scanner teclado = new Scanner(System.in);
         
         
         /*COMENTARIOS ENTRE NOSOSTROS EN ESTA ZONA
         
         Commit 1 y 2 Julio 
         
         
         //Comentario para comprobar el github
         
         
         */
        
         
         //TODO LO QUE SE ESTA ELABORANDO HASTA AHORA ES TEMPORAL Y ESTA SUJETA A CAMBIOS, SOLO ES PARA PROBAR EL PROGRAMA 
        System.out.println("\n\nProbando Sistema, de momento se crean 3 alumnos registrados automaticamente, luego"
                + "\npueden colocar un codigo y contraseña para validar si ese alumno esta en los registros");
        
         Date fechatest;
         
         Facultad facultadtest;  //La clase facultad le pertenece a la clase alumno
         facultadtest = new Facultad("FISI");
         
         
         
         //Se crea un arreglo de Alumnos:
         ArregloAlumnos alumnosregistrados;
         alumnosregistrados = new ArregloAlumnos(2);
         
         //Se crea el sistema
         //..............
         
         Sistema sistema;
         
         //..............       
         //Se crean las clases que necesita el sistema, las cuales son: 
         
         ArregloFecha fechasSistema;
         ArregloTurno turnosSistema;
         ArregloAlumnos alumnosRegistrados;
         fechasSistema = new ArregloFecha(); 
         turnosSistema = new ArregloTurno();      
         alumnosRegistrados = new ArregloAlumnos(3);
         
         
         
         Alumno alumnoadd;//Esta clase alumnoadd sera para añadir los alumnos al arreglo de alumnos, que esta dentro de la clase sistema 
         
         
         
         alumnoadd = new Alumno(1111, "correo1", "contra1", "nombres1", "apellidos1", "codigo1", facultadtest); 
         alumnosRegistrados.agregarAlumno(alumnoadd); 
         
         alumnoadd = new Alumno(2222, "correo2", "contra2", "nombres2", "apellidos2", "codigo2", facultadtest);  
         alumnosRegistrados.agregarAlumno(alumnoadd);
         
         alumnoadd = new Alumno(3333, "correo3", "contra3", "nombres3", "apellidos3", "codigo3", facultadtest);  
         alumnosRegistrados.agregarAlumno(alumnoadd);
         
         //Terminamos de crear el sistema
         sistema = new Sistema(true, fechasSistema, turnosSistema,alumnosRegistrados);
         
         System.out.println("Los alumnos que tiene el sistema son\n"+alumnosRegistrados);
         
         //Ahora que ya creamos el sistema, con sus arreglos adentro, pasamos a la parte de logearse 
         
         
         
         String codigo;
         String contraseña;
         System.out.println("------------------------------------------------");
         System.out.println("Ingrese su codigo: ");
         codigo = teclado.nextLine();      
         System.out.println("Ingrese su contraseña: ");
         contraseña = teclado.nextLine();
         System.out.println("------------------------------------------------");
  
         Alumno alumnotest; //La clase alumnotest, servira para crearse con un constructor que solo requiere contraseña  y codigo para poder usar el metodo que esta en usuario llamado logearse
         
          
         alumnotest = new Alumno(contraseña, codigo);
         
         if(alumnotest.logearse(contraseña,codigo,sistema.getAlumnosRegistrados())==true){
             
             System.out.println("Usted es un alumno, y si esta registrado");
             System.out.println("El alumno es: ");
             
             System.out.println(alumnotest.mostrarAlumno(codigo, sistema.getAlumnosRegistrados()));
             System.out.println();
         }
         else {
             System.out.println("Usted es un alumno, y no esta registrado");
         }
           
       
        
         
         
        
    }
    
}
