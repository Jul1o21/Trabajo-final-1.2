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
public class ArregloFecha {
    private Fecha FechaA[]; 
    private int indice;
    
    public ArregloFecha() {
        this.indice = 0;
        this.FechaA = new Fecha[7];  //7 dias representan las 7 fechas 
                
    }

    @Override
    public String toString() {
        return "ArregloFecha{" + "FechaA=" + Arrays.toString(FechaA) + ", indice=" + indice + '}';
    }
    
    
}
