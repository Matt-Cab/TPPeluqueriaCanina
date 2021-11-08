package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author Matias Cabrera
 */
public class Controladora {
    
    ControladoraPersistencia controlMascota = new ControladoraPersistencia();
    
    // método para alta
    public void crearMascota(MascotaCliente mascota) {
        controlMascota.crearMascota(mascota);
    }
    
    // método para alta (sobrecarga)
    public void crearMascota(int nroCliente, String nombrePerro, String raza, String color, boolean esAlergico, boolean necesitaAtencionEspecial, String nombreDuenio, String celDuenio, String observaciones) {
        
        MascotaCliente mascota = new MascotaCliente();
        
        mascota.setNumCliente(nroCliente);
        mascota.setNombrePerro(nombrePerro);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(esAlergico);
        mascota.setAtencionEspecial(necesitaAtencionEspecial);
        mascota.setNombreDuenio(nombreDuenio);
        mascota.setCelularDuenio(celDuenio);
        mascota.setObservaciones(observaciones);
        
        controlMascota.crearMascota(mascota);
    }
    
    // método para baja
    public void eliminarMascota(MascotaCliente mascota) {
        controlMascota.eliminarMascota(mascota);
    }
    
    // método para baja (sobrecarga)
    public void eliminarMascota(int nroCliente) {
        controlMascota.eliminarMascota(nroCliente);
    }
    
    // método de lectura
    public List<MascotaCliente> obtenerMascotas() {
        return controlMascota.obtenerMascotas();
    }
    
    // método de modificación
    public void modificarMascota(MascotaCliente mascota) {
        controlMascota.modificarMascota(mascota);
    }
    
    // método para busqueda
    public MascotaCliente buscarMascota(MascotaCliente mascota) {
        return controlMascota.buscarMascota(mascota);
    }

    // método para busqueda (sobrecarga)
    public MascotaCliente buscarMascota(int nroCliente) {
        return controlMascota.buscarMascota(nroCliente);
    }
    
}
