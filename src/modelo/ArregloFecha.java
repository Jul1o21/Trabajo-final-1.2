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
public class ArregloFecha {

    private Fecha FechaA[];
    private int indice;

    public ArregloFecha() {
        this.indice = 0;
        this.FechaA = new Fecha[7];  //de momento 7, ya que una fecha representara un dia de la semana

    }

    public boolean agregarFecha(Fecha fecha) {
        boolean result = false;

        this.FechaA[this.indice] = fecha;
        this.indice++;

        result = true;

        return result;
    }

    @Override
    public String toString() {
        return "ArregloFecha{" + "FechaA=" + Arrays.toString(FechaA) + ", indice=" + indice + '}';
    }

}
