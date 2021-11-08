package persistencia;

import java.util.List;
import logica.MascotaCliente;

/**
 *
 * @author Matias Cabrera
 */
public class ControladoraPersistencia {
    
    MascotaClienteJpaController mascotaJPA = new MascotaClienteJpaController();

    // método para alta
    public void crearMascota(MascotaCliente mascota) {
        try {
            mascotaJPA.create(mascota);
        }
        catch (Exception e) {
            System.out.println("No se pudo dar de alta a la mascota");
            System.out.println(e);
        }
    }
    
    // método para baja
    public void eliminarMascota(MascotaCliente mascota) {
        try {
            mascotaJPA.destroy(mascota.getNumCliente());
        }
        catch (Exception e) {
            System.out.println("No se pudo dar de baja a la mascota");
            System.out.println(e);
        }
    }
    
    // método para baja (sobrecarga)
    public void eliminarMascota(int nroCliente) {
        try {
            mascotaJPA.destroy(nroCliente);
        }
        catch (Exception e) {
            System.out.println("No se pudo dar de baja a la mascota");
            System.out.println(e);
        }
    }
    
    // método de lectura
    public List<MascotaCliente> obtenerMascotas() {
        
        List<MascotaCliente> listaMascotas = null;
        
        try {
            listaMascotas = mascotaJPA.findMascotaClienteEntities();
        }
        catch (Exception e) {
            System.out.println("No se pudo obtener la lista de mascotas.");
            System.out.println(e);
        }

        return listaMascotas;
    }
    
    // método de modificación
    public void modificarMascota(MascotaCliente mascota) {
        try {
            mascotaJPA.edit(mascota);
        }
        catch (Exception e) {
            System.out.println("No se pudo modificar la información de la mascota");
            System.out.println(e);
        }
    }
    
    // método para busqueda
    public MascotaCliente buscarMascota(MascotaCliente mascota) {
        
        MascotaCliente mascotaEncontrada = null;
        
        try {
            mascotaEncontrada = mascotaJPA.findMascotaCliente(mascota.getNumCliente());
        }
        catch (Exception e) {
            System.out.println("No se pudo buscar a la mascota.");
            System.out.println(e);
        }

        return mascotaEncontrada;
    }

    // método para busqueda (sobrecarga)
    public MascotaCliente buscarMascota(int nroCliente) {
        
        MascotaCliente mascotaEncontrada = null;
        
        try {
            mascotaEncontrada = mascotaJPA.findMascotaCliente(nroCliente);
        }
        catch (Exception e) {
            System.out.println("No se pudo buscar a la mascota.");
            System.out.println(e);
        }

        return mascotaEncontrada;
    }
}
