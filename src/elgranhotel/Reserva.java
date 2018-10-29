/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel;

import java.sql.Date;

/**
 *
 * @author ma
 */
public class Reserva {

   
   private int idReserva;
   private Date fechaInicioReserva;
   private Date fechaFinReserva;
   private int estadoReserva;
   private  Huesped dniHuesped;
   private  Habitacion idHabitacion;

    Reserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public Reserva(int idReserva, Date fechaInicioReserva, Date fechaFinReserva, int estadoReserva, Huesped dniHuesped, Habitacion idHabitacion) {
        this.idReserva = idReserva;
        this.fechaInicioReserva = fechaInicioReserva;
        this.fechaFinReserva = fechaFinReserva;
        this.estadoReserva = estadoReserva;
        this.dniHuesped = dniHuesped;
        this.idHabitacion = idHabitacion;
    }
   
    /**
     * @return the idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param idReserva the idReserva to set
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    /**
     * @return the fechaInicioReserva
     */
    public Date getFechaInicioReserva() {
        return fechaInicioReserva;
    }

    /**
     * @param fechaInicioReserva the fechaInicioReserva to set
     */
    public void setFechaInicioReserva(Date fechaInicioReserva) {
        this.fechaInicioReserva = fechaInicioReserva;
    }

    /**
     * @return the fechaFinReserva
     */
    public Date getFechaFinReserva() {
        return fechaFinReserva;
    }

    /**
     * @param fechaFinReserva the fechaFinReserva to set
     */
    public void setFechaFinReserva(Date fechaFinReserva) {
        this.fechaFinReserva = fechaFinReserva;
    }

    /**
     * @return the estadoReserva
     */
    public int getEstadoReserva() {
        return estadoReserva;
    }

    /**
     * @param estadoReserva the estadoReserva to set
     */
    public void setEstadoReserva(int estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    /**
     * @return the dniHuesped
     */
    public Huesped getDniHuesped() {
        return dniHuesped;
    }

    /**
     * @param dniHuesped the dniHuesped to set
     */
    public void setDniHuesped(Huesped dniHuesped) {
        this.dniHuesped = dniHuesped;
    }

    /**
     * @return the idHabitacion
     */
    public Habitacion getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * @param idHabitacion the idHabitacion to set
     */
    public void setIdHabitacion(Habitacion idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
   
   
}
