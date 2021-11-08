package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Matias Cabrera
 */
@Entity
public class MascotaCliente implements Serializable {

//    @Id
//    @GeneratedValue( strategy = GenerationType.AUTO )
    @Id
    private int numCliente;
    
    @Basic
    private String nombrePerro;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean atencionEspecial;
    private String nombreDuenio;
    private String celularDuenio;
    private String observaciones;

    public MascotaCliente() {
    }

    public MascotaCliente(int numCliente, String nombrePerro, String raza, String color, boolean alergico, boolean atencionEspecial, String nombreDuenio, String celularDuenio, String observaciones) {
        this.numCliente = numCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.nombreDuenio = nombreDuenio;
        this.celularDuenio = celularDuenio;
        this.observaciones = observaciones;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(boolean atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getCelularDuenio() {
        return celularDuenio;
    }

    public void setCelularDuenio(String celularDuenio) {
        this.celularDuenio = celularDuenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() { // TODO: borrar este método antes de enviar
        return "MascotaCliente{" + "numCliente=" + numCliente + ", nombrePerro=" + nombrePerro + ", raza=" + raza + ", color=" + color + ", alergico=" + alergico + ", atencionEspecial=" + atencionEspecial + ", nombreDuenio=" + nombreDuenio + ", celularDuenio=" + celularDuenio + ", observaciones=" + observaciones + '}';
    }
    
}
