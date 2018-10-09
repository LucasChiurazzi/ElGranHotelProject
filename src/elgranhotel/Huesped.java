
package elgranhotel;

//atributos
public class Huesped {
    private long dniHuesped;
    private String nombreHuesped;
    private String domicilioHuesped;
    private String correoHuesped;
    private String celularHuesped;

// constructor
public Huesped(long dniHuesped, String nombreHuesped, String domicilioHuesped, String correoHuesped, String celularHuesped){
    this.dniHuesped=dniHuesped;
    this.nombreHuesped=nombreHuesped;
    this.domicilioHuesped=domicilioHuesped;
    this.correoHuesped=correoHuesped;
    this.celularHuesped=celularHuesped;
} 

public Huesped(){
}

//getters and setters
    public long getDniHuesped() {
        return dniHuesped;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public String getDomicilioHuesped() {
        return domicilioHuesped;
    }

    public String getCorreoHuesped() {
        return correoHuesped;
    }

    public String getCelularHuesped() {
        return celularHuesped;
    }

    public void setDniHuesped(long dniHuesped) {
        this.dniHuesped = dniHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public void setDomicilioHuesped(String domicilioHuesped) {
        this.domicilioHuesped = domicilioHuesped;
    }

    public void setCorreoHuesped(String correoHuesped) {
        this.correoHuesped = correoHuesped;
    }

    public void setCelularHuesped(String celularHuesped) {
        this.celularHuesped = celularHuesped;
    }
   
}