/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.pkgfinal;

import Clases.*;
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
         
         El sistema es semanal = los turnos de los tickets se crean para toda la semana
         
         
         
         //Comentario para comprobar el github
         
         
         */
        //TODO LO QUE SE ESTA ELABORANDO HASTA AHORA ES TEMPORAL Y ESTA SUJETA A CAMBIOS, SOLO ES PARA PROBAR EL PROGRAMA 
        System.out.println("\n\nProbando Sistema, de momento se crean 3 alumnos registrados automaticamente, luego"
                + "\nse puede colocar un codigo y contraseña para validar si ese alumno esta en los registros");

        Date fechatest;
        fechatest = new Date();
        Facultad facultadtest;  //La clase facultad le pertenece a la clase alumno
        facultadtest = new Facultad("FISI");

        //Se crea un arreglo de Alumnos:
        ArregloAlumnos alumnosregistrados;

        //Se crea el sistema
        //..............
        Sistema sistema;

        //..............       
        //Se crean las clases que necesita el sistema, las cuales son: 
        ArregloFecha fechasSistema;
        ArregloTurno turnosSistema;
        ArregloAlumnos alumnosRegistrados;
        CabeceraTicket ticketsdelsistema;
        ticketsdelsistema = null;
        fechasSistema = new ArregloFecha();
        turnosSistema = new ArregloTurno();
        alumnosRegistrados = new ArregloAlumnos(3); //3 para probar el sistema
        Operario operarioregistradounico; //Este operario sera el que este registrado de momento
        operarioregistradounico = new Operario(fechatest, "contraop", "nombreop", "appelidoop", "codigoop1");

        Alumno alumnoadd;//Esta clase alumnoadd sera para añadir los alumnos al arreglo de alumnos, que esta dentro de la clase sistema 

        alumnoadd = new Alumno(1111, "correo1", "contra1", "nombres1", "apellidos1", "codigo1", facultadtest);
        alumnosRegistrados.agregarAlumno(alumnoadd);

        alumnoadd = new Alumno(2222, "correo2", "contra2", "nombres2", "apellidos2", "codigo2", facultadtest);
        alumnosRegistrados.agregarAlumno(alumnoadd);

        alumnoadd = new Alumno(3333, "correo3", "contra3", "nombres3", "apellidos3", "codigo3", facultadtest);
        alumnosRegistrados.agregarAlumno(alumnoadd);

        //Terminamos de crear el sistema
        sistema = new Sistema(true, fechasSistema, turnosSistema, alumnosRegistrados, operarioregistradounico);

        System.out.println("Los alumnos que tiene el sistema son:\n" + alumnosRegistrados);
        System.out.println("El operio de este sistema es:\n" + operarioregistradounico);
        //Ahora que ya creamos el sistema, con sus arreglos adentro, pasamos a la parte de logearse 

        //Menu para seleccionar si se trata de un usuario o un operario
        int op1;
        System.out.println("Digite 1 si es un alumno o 2 si es un Operario, 3 para cerrar sesion y 4 para salir del sistema");
        op1 = teclado.nextInt();
        if (op1 != 3 && op1 != 4) {
            String codigo;
            String contraseña;
            System.out.println("------------------------------------------------");
            System.out.println("Ingrese su codigo: ");
            codigo = teclado.next();

            System.out.println("Ingrese su contraseña: ");
            contraseña = teclado.next();
            System.out.println("------------------------------------------------");
        }
        String codigo;   //ESTO GENERA OTRO ERROR
        String contraseña;
        codigo = null;
        contraseña = null;

        do {

            switch (op1) {

                case 2://Operario

                    if (sistema.validarlogdeoperario(codigo, contraseña) == true) {

                        System.out.println("Usted es un operario, y si esta registrado");
                        int op2;
                        Operario operariotest;

                        operariotest = operarioregistradounico;

                        System.out.println("0.-Salir\n1.-Registrar un alumno\n2.-Validar un ticket\n3.-Cambiar las raciones por turno"
                                + "\n4.-Crear una fecha para generar los tickets\n5.-Mostrar los alumnos registrados");

                        op2 = teclado.nextInt();
                        switch (op2) {
                            case 1:
                                System.out.println("Digite los datos del alumno a agregar,"
                                        + "DNI,correo,contraseña,nombres,apellidos, y codigo la facultad por defecto es FISI:");
                                //int DNI, String correo, String contrasena, String nombres, String apellidos, String codigo, Facultad facultad
                                int DNIadd;
                                String correoadd,
                                 contrasenaadd,
                                 nombreadd,
                                 apellidosadd,
                                 codigoadd;
                                DNIadd = teclado.nextInt();
                                correoadd = teclado.next();
                                contrasenaadd = teclado.next();
                                nombreadd = teclado.next();
                                apellidosadd = teclado.next();
                                codigoadd = teclado.next();

                                alumnoadd = new Alumno(DNIadd, correoadd, contrasenaadd, nombreadd, apellidosadd, codigoadd, facultadtest);

                                operariotest.RegistrarAlumno(alumnoadd, alumnosRegistrados);

                                break;

                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:
                                Fecha fechagenerada;
                                fechagenerada = operariotest.crearfechaparatickets();

                                System.out.println("Ingrese los datos de los tickets");
                                int numeronivel,
                                 numeroturno;
                                String intervaloturno,
                                 alimentoname;

                                Nivel nivel;
                                Turno turno;
                                Alimento alimento;

                                System.out.println("Digite el nivel:");

                                numeronivel = teclado.nextInt();
                                nivel = new Nivel(numeronivel);

                                System.out.println("Datos del turno:");

                                System.out.println("  Ingrese el numero del turno:");
                                numeroturno = teclado.nextInt();
                                teclado.nextLine();

                                System.out.println("  Ingrese el intervalo del turno:");
                                intervaloturno = teclado.nextLine();

                                turno = new Turno(numeroturno, intervaloturno);

                                System.out.println("Digite el alimento:");

                                alimentoname = teclado.nextLine();
                                alimento = new Alimento(alimentoname);

                                CabeceraTicket ticketsgeneradosporop;
                                // ticketsgeneradosporop = new CabeceraTicket(333, nivel, turno, alimento, fechagenerada);
                                ticketsgeneradosporop = fechagenerada.creartickets(nivel, turno, alimento, fechagenerada);

                                sistema.setTicketscreadosconfecha(ticketsgeneradosporop);

                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(ticketsgeneradosporop);
                                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                //CabeceraTicket(Sistema.racionestotalesporturno, nivel, turno, alimento, fecha); 
                                break;
                            case 5:
                                System.out.println("Los alumnos que tiene el sistema son\n" + alumnosRegistrados);
                                break;
                            case 0:
                                op1 = 3;
                                break;

                        }

                    }
                    System.out.println("Usted es un operario, y no esta registrado");
                    op1 = 3;

                    break;

                case 3:
                    System.out.println("Digite 1 si es un alumno o 2 si es un Operario");
                    op1 = teclado.nextInt();
                    System.out.println("------------------------------------------------");
                    System.out.println("Ingrese su codigo: ");
                    codigo = teclado.next();

                    System.out.println("Ingrese su contraseña: ");
                    contraseña = teclado.next();
                    System.out.println("------------------------------------------------");

                    break;

                case 4:
                    System.out.println("ADIOS");
                    System.exit(0);
                    break;

                case 1: //Alumno
                    int opa;

                    Alumno alumnotest; //La clase alumnotest, servira para crearse con un constructor que solo requiere contraseña  y codigo para poder usar el metodo que esta en usuario llamado logearse

                    alumnotest = new Alumno(contraseña, codigo);
                    op1 = 0;
                    if (alumnotest.logearse(contraseña, codigo, sistema.getAlumnosRegistrados()) == true) {

                        System.out.println("Usted es un alumno, y si esta registrado");
                        System.out.println("El alumno es: ");

                        System.out.println(alumnotest.mostrarAlumno(codigo, sistema.getAlumnosRegistrados()));
                        alumnotest = alumnotest.mostrarAlumno(codigo, sistema.getAlumnosRegistrados());
                        System.out.println();
                    } else {
                        System.out.println("Usted es un alumno, y no esta registrado");
                    }

                    System.out.println("0.-Salir\n1.-Solicitar ticket\n");
                    opa = teclado.nextInt();
                    switch (opa) {  //Menu del alumno
                        case 1:

                            sistema.asignarticket(alumnotest);

                            System.out.println(sistema.getTicketscreadosconfecha());

                            break;

                        case 0:
                            op1 = 3;
                            break;
                    }

                    break;

            }

        } while (op1 != 0);

    }

}
