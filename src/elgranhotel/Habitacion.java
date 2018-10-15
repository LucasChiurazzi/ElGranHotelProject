/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel;

/**
 *
 * @author ma
 */
public class Habitacion {
 private int numeroHabitacion;
 private int pisoHabitacion;
 private boolean estadoHabitacion;
 private TipoHabitacion tipoHabitacion;
  
 public Habitacion(int numeroHabitacion, int pisoHabitacion, boolean estadoHabitacion, TipoHabitacion tipoHabitacion){
this.numeroHabitacion=numeroHabitacion;
this.pisoHabitacion=pisoHabitacion;
this.estadoHabitacion=estadoHabitacion;
this.tipoHabitacion=tipoHabitacion;
 }

    Habitacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the numeroHabitacion
     */
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    /**
     * @param numeroHabitacion the numeroHabitacion to set
     */
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    /**
     * @return the pisoHabitacion
     */
    public int getPisoHabitacion() {
        return pisoHabitacion;
    }

    /**
     * @param pisoHabitacion the pisoHabitacion to set
     */
    public void setPisoHabitacion(int pisoHabitacion) {
        this.pisoHabitacion = pisoHabitacion;
    }

    /**
     * @return the estadoHabitacion
     */
    public boolean getEstadoHabitacion() {
        return estadoHabitacion;
    }

    /**
     * @param estadoHabitacion the estadoHabitacion to set
     */
    public void setEstadoHabitacion(boolean estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    /**
     * @return the tipoHabitacion
     */
    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * @param tipoHabitacion the tipoHabitacion to set
     */
    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
 
}
