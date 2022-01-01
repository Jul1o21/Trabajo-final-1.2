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
public class Turno {
    private int numeroturno;
    private String intervalominutos;

    public Turno(int numeroturno, String intervalominutos) {
        this.numeroturno = numeroturno;
        this.intervalominutos = intervalominutos;
    }

    public int getNumeroturno() {
        return numeroturno;
    }

    public String getIntervalominutos() {
        return intervalominutos;
    }

    @Override
    public String toString() {
        return "Turno{" + "numeroturno=" + numeroturno + ", intervalominutos=" + intervalominutos + '}';
    }
    
    
}
