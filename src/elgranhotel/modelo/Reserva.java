/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class Reserva {
    //atributos
    private int idReserva= -1;
    private LocalDate fechaInicioReserva;
    private LocalDate fechaFinReserva;
    private boolean estadoReserva;
    private Huesped huesped;
    private Habitacion habitacion;
    
    //constructor
    public Reserva(int idReserva, LocalDate fechaInicioReserva, LocalDate fechaFinReserva, boolean estadoReserva, Huesped huesped, Habitacion habitacion) {
        this.idReserva = idReserva;
        this.fechaInicioReserva = fechaInicioReserva;
        this.fechaFinReserva = fechaFinReserva;
        this.estadoReserva = estadoReserva;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    
    public Reserva(LocalDate fechaInicioReserva, LocalDate fechaFinReserva, boolean estadoReserva, Huesped huesped, Habitacion habitacion) {
        this.idReserva = -1;
        this.fechaInicioReserva = fechaInicioReserva;
        this.fechaFinReserva = fechaFinReserva;
        this.estadoReserva = estadoReserva;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    public Reserva() {
    this.idReserva= -1;
    }
    

    public int getIdReserva() {
        return idReserva;
    }
    
    public LocalDate getFechaInicioReserva() {
        return fechaInicioReserva;
    }

    public LocalDate getFechaFinReserva() {
        return fechaFinReserva;
    }

    public boolean getEstadoReserva() {
        return estadoReserva;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setFechaInicioReserva(LocalDate fechaInicioReserva) {
        this.fechaInicioReserva = fechaInicioReserva;
    }

    public void setFechaFinReserva(LocalDate fechaFinReserva) {
        this.fechaFinReserva = fechaFinReserva;
    }

    public void setEstadoReserva(boolean estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
    
    
}
