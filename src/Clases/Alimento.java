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
class Alimento {
    private String tipoalimento;

    public Alimento(String tipoalimento) {
        this.tipoalimento = tipoalimento;
    }
    
    
    @Override
    public String toString() {
        return "Alimento{" + "tipoalimento=" + tipoalimento + '}';
    }
    
    
}
