
package elgranhotel.modelo;


public class Habitacion {
    //atributos
    private int numeroHabitacion;
    private int pisoHabitacion;
    private boolean estadoHabitacion;
    private TipoHabitacion tipoHabitacion;
    
    // constructor1
    public Habitacion(int numeroHabitacion, int pisoHabitacion, boolean estadoHabitacion, TipoHabitacion tipoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.pisoHabitacion = pisoHabitacion;
        this.estadoHabitacion = estadoHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }
    
    // constructor2
    public Habitacion() {
    }
    
    //getters y setters
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public int getPisoHabitacion() {
        return pisoHabitacion;
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
 
    public void setPisoHabitacion(int pisoHabitacion) {
       this.pisoHabitacion = pisoHabitacion;
    }
    
}
