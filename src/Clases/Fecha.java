/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author cubas
 */
public class Fecha {
    private Date fecha;
    private boolean estadoopen;
    
    public Fecha(Date fecha, boolean estadoopen) {
        this.fecha = fecha;
        this.estadoopen = estadoopen;
    }

    public void setEstadoopen(boolean estadoopen) {
        this.estadoopen = estadoopen;
    }
    
    @Override
    public String toString() {
        return "Fecha{" + "fecha=" + fecha + ", estadoopen=" + estadoopen + '}';
    }
    
    
    
}
