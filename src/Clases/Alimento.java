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
public class Alimento {
    private String tipoAlimento;

    public Alimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
    
    
    @Override
    public String toString() {
        return "Alimento{" + "tipoalimento=" + tipoAlimento + '}';
    }
    
    
}
