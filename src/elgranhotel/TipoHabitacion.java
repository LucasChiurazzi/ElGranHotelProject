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
public class TipoHabitacion {
   private int idTipoHabitacion;
   private String categoriaTipoHabitacion;
   private int cantPersonasTipoHabitacion;
   private double precioNocheTipoHabitacion;
   private String tipoCamaTipoHabitacion;
   private int cantidadCamasTipoHabitacion;
   //constructor
   TipoHabitacion(int idTipoHabitacion, String categoriaTipoHabitacion, int cantPersonasTipoHabtacion, double precioNocheTipoHabitacion, String tipoCamaTipoHabitacion, int cantidadCamasTipoHabitacion){
       this.idTipoHabitacion=idTipoHabitacion;
       this.categoriaTipoHabitacion=categoriaTipoHabitacion;
       this.cantPersonasTipoHabitacion=cantPersonasTipoHabtacion;
       this.precioNocheTipoHabitacion=precioNocheTipoHabitacion;
       this.tipoCamaTipoHabitacion=tipoCamaTipoHabitacion;
       this.cantidadCamasTipoHabitacion=cantidadCamasTipoHabitacion;
   }
   
   //getter y setter

    /**
     * @return the idTipoHabitacion
     */
    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    /**
     * @param idTipoHabitacion the idTipoHabitacion to set
     */
    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    /**
     * @return the categoriaTipoHabitacion
     */
    public String getCategoriaTipoHabitacion() {
        return categoriaTipoHabitacion;
    }

    /**
     * @param categoriaTipoHabitacion the categoriaTipoHabitacion to set
     */
    public void setCategoriaTipoHabitacion(String categoriaTipoHabitacion) {
        this.categoriaTipoHabitacion = categoriaTipoHabitacion;
    }

    /**
     * @return the cantPersonasTipoHabtacion
     */
    public int getCantPersonasTipoHabitacion() {
        return cantPersonasTipoHabitacion;
    }

    /**
     * @param cantPersonasTipoHabtacion the cantPersonasTipoHabtacion to set
     */
    public void setCantPersonasTipoHabtacion(int cantPersonasTipoHabtacion) {
        this.cantPersonasTipoHabitacion = cantPersonasTipoHabtacion;
    }

    /**
     * @return the precioNocheTipoHabitacion
     */
    public double getPrecioNocheTipoHabitacion() {
        return precioNocheTipoHabitacion;
    }

    /**
     * @param precioNocheTipoHabitacion the precioNocheTipoHabitacion to set
     */
    public void setPrecioNocheTipoHabitacion(double precioNocheTipoHabitacion) {
        this.precioNocheTipoHabitacion = precioNocheTipoHabitacion;
    }

    /**
     * @return the tipoCamaTipoHabitacion
     */
    public String getTipoCamaTipoHabitacion() {
        return tipoCamaTipoHabitacion;
    }

    /**
     * @param tipoCamaTipoHabitacion the tipoCamaTipoHabitacion to set
     */
    public void setTipoCamaTipoHabitacion(String tipoCamaTipoHabitacion) {
        this.tipoCamaTipoHabitacion = tipoCamaTipoHabitacion;
    }

    /**
     * @return the cantidadCamasTipoHabitacion
     */
    public int getCantidadCamasTipoHabitacion() {
        return cantidadCamasTipoHabitacion;
    }

    /**
     * @param cantidadCamasTipoHabitacion the cantidadCamasTipoHabitacion to set
     */
    public void setCantidadCamasTipoHabitacion(int cantidadCamasTipoHabitacion) {
        this.cantidadCamasTipoHabitacion = cantidadCamasTipoHabitacion;
    }
   
}
