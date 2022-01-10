/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Arrays;

/**
 *
 * @author cubas
 */
public class ArregloCabeceras {

    private int indice;
    private CabeceraTicket[] cabeceras;

    public ArregloCabeceras() {
        this.indice = 0;
        this.cabeceras = new CabeceraTicket[Sistema.turnospordia];
    }

    public void agregarticketscreadosconfecha(CabeceraTicket ticketscreadosconfecha) {

        boolean input = false;
        for (int i = 0; i < Sistema.turnospordia; i++) {
            if (this.cabeceras[i] == null && input == false) {
                this.cabeceras[i] = ticketscreadosconfecha;
                input = true;
                System.out.println("Se ha agregado una cabecera a la lista de cabeceras");
            }

        }

    }

    public void asignarTicketCabeceras(Alumno alumno) {
        if (this.cabeceras == null) {
            System.out.println("NO HAY TICKETS DISPONIBLES EN EL SISTEMA");

        } else {
           boolean verificar=false;
            for (int i = 0; i < Sistema.turnospordia; i++) {
                if(this.cabeceras[i]!=null&&verificar==false){
                    this.cabeceras[i].asignarticketalumno(alumno);
                   
                    verificar=true;
                }
                
            }

        }
    }

    public void validaralumnocabeceras(String codigo) {

        for (int i = 0; i < Sistema.turnospordia; i++) {
            if (cabeceras[i] != null) {
                if (cabeceras[i].validarticketcab(codigo) == true) {
                    System.out.println("Alumno validado y estado de ticket cambiado");

                }
            }

        }

    }

    @Override
    public String toString() {
        return "ArregloCabeceras{" + "cabeceras=" + Arrays.toString(cabeceras) + '}';
    }

}
