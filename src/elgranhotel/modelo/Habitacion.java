
package elgranhotel.modelo;


public class Habitacion {
    private int numeroHabitacion;
    private int pisoHabitacion;
    private boolean estadoHabitacion;
    private TipoHabitacion tipoHabitacion;

    public Habitacion() {
    }
    
   
    public Habitacion(int numeroHabitacion, int pisoHabitacion, boolean estadoHabitacion, TipoHabitacion tipoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.pisoHabitacion = pisoHabitacion;
        this.estadoHabitacion = estadoHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }
    
    public boolean getEstadoHabitacion(){
        return estadoHabitacion;
    }
    
    public void setEstadoHabitacion(boolean estadoHabitacion){
        this.estadoHabitacion = estadoHabitacion;
    }
    
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getPisoHabitacion() {
        return pisoHabitacion;
    }

    public void setPisoHabitacion(int pisoHabitacion) {
        this.pisoHabitacion = pisoHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }


    
}

