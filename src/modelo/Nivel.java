/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cubas
 */
public class Nivel {
    private int numeronivel;

    public Nivel(int tiponivel) {
        this.numeronivel = tiponivel;
    }

    @Override
    public String toString() {
        return "Nivel{" + "tiponivel=" + numeronivel + '}';
    }
    
    
}
