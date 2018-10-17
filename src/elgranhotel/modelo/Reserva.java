
package elgranhotel.modelo;

import java.time.LocalDate;


public class Reserva {
    //atributos
    private int idReserva;
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
        this.fechaInicioReserva = fechaInicioReserva;
        this.fechaFinReserva = fechaFinReserva;
        this.estadoReserva = estadoReserva;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    public Reserva() {
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
