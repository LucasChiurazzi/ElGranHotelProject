package elgranhotel.modelo;


public class TipoHabitacion {
    //atributos
    private int idTipoHabitacion;
    private String categoriaTipoHabitacion;
    private int cantPersonasTipoHabitacion;
    private double precioNocheTipoHabitacion;
    //tipoCama dejo de ser clase y paso a ser un String porque no necesitabamos
    //ningun atributo de tipocama que no pueda estar en los atrio
    private String tipoCamaTipoHabitacion;
    private int cantidadCamasTipoHabitacion;

    //constructor1
    public TipoHabitacion(int idTipoHabitacion, String categoriaTipoHabitacion, int cantPersonasTipoHabitacion, double precioNocheTipoHabitacion, String tipoCamaTipoHabitacion, int cantidadCamasTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.categoriaTipoHabitacion = categoriaTipoHabitacion;
        this.cantPersonasTipoHabitacion = cantPersonasTipoHabitacion;
        this.precioNocheTipoHabitacion = precioNocheTipoHabitacion;
        this.tipoCamaTipoHabitacion = tipoCamaTipoHabitacion;
        this.cantidadCamasTipoHabitacion = cantidadCamasTipoHabitacion;
    }
    
    //constructor2
    public TipoHabitacion() {
    }


    
    //getters
    
    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public String getCategoriaTipoHabitacion() {
        return categoriaTipoHabitacion;
    }

    public int getCantPersonasTipoHabitacion() {
        return cantPersonasTipoHabitacion;
    }

    public double getPrecioNocheTipoHabitacion() {
        return precioNocheTipoHabitacion;
    }

    public String getTipoCamaTipoHabitacion() {
        return tipoCamaTipoHabitacion;
    }

    public int getCantidadCamasTipoHabitacion() {
        return cantidadCamasTipoHabitacion;
    }

    
    
    //setters
    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public void setCategoriaTipoHabitacion(String categoriaTipoHabitacion) {
        this.categoriaTipoHabitacion = categoriaTipoHabitacion;
    }

    public void setCantPersonasTipoHabitacion(int cantPersonasTipoHabitacion) {
        this.cantPersonasTipoHabitacion = cantPersonasTipoHabitacion;
    }

    public void setPrecioNocheTipoHabitacion(double precioNocheTipoHabitacion) {
        this.precioNocheTipoHabitacion = precioNocheTipoHabitacion;
    }

    public void setTipoCamaTipoHabitacion(String tipoCamaTipoHabitacion) {
        this.tipoCamaTipoHabitacion = tipoCamaTipoHabitacion;
    }

    public void setCantidadCamasTipoHabitacion(int cantidadCamasTipoHabitacion) {
        this.cantidadCamasTipoHabitacion = cantidadCamasTipoHabitacion;
    }   
}
