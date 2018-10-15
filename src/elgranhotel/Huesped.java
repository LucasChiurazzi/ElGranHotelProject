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
public class Huesped {
    private String nombre;
private long dni;
private String domicilio;
private String correo;
private String celular;

// constructor
public Huesped(String nombre, long dni, String domicilio, String correo, String celular){
    this.nombre=nombre;
    this.dni=dni;
    this.domicilio=domicilio;
    this.correo=correo;
    this.celular=celular;
} 

    Huesped() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the dni
     */
    public long getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(long dni) {
        this.dni = dni;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

   
}
