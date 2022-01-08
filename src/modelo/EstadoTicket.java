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
public class EstadoTicket {

    private String estadoactual;

    public EstadoTicket(String estadoactual) {
        this.estadoactual = estadoactual;
    }

    public String getEstadoactual() {
        return estadoactual;
    }

    public void setEstadoactual(String estadoactual) {
        this.estadoactual = estadoactual;
    }

    @Override
    public String toString() {
        return "EstadoTicket{" + "estadoactual=" + estadoactual + '}';
    }

}
