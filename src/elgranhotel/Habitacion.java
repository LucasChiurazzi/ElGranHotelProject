/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel;

/**
 *
 * @author Lucas
 */
public class Habitacion {
    private int numeroHabitacion;
    private int piso;
    private boolean estadoHabitacion;
    private TipoHabitacion tipohabitacion;

    public Habitacion() {
    }
    
   
    public Habitacion(int numeroHabitacion, int piso, boolean estadoHabitacion, TipoHabitacion tipohabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.piso = piso;
        this.estadoHabitacion = estadoHabitacion;
        this.tipohabitacion = tipohabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public boolean getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public TipoHabitacion getTipohabitacion() {
        return tipohabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setEstadoHabitacion(boolean estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public void setTipohabitacion(TipoHabitacion tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }
 
    
    
}
