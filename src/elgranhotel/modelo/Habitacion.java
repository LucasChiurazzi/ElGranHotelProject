/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;

/**
 *
 * @author Lucas
 */
public class Habitacion {
    private int numeroHabitacion;
    private int piso;
    private boolean estadoHabitacion;
    private TipoHabitacion tipoHabitacion;

    public Habitacion() {
    }
    
   
    public Habitacion(int numeroHabitacion, int piso, boolean estadoHabitacion, TipoHabitacion tipoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.piso = piso;
        this.estadoHabitacion = estadoHabitacion;
        this.tipoHabitacion = tipoHabitacion;
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

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setEstadoHabitacion(boolean estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
 
    public void setPiso(int piso) {
       this.piso = piso;
    }
    
}
