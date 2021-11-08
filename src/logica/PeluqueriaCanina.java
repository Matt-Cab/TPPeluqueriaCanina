package logica;

import igu.IGUPeluqueriaCanina; // TODO: borrar esto antes de entregar

/**
 *
 * @author Matias Cabrera
 */
public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        IGUPeluqueriaCanina iguPeluqueria = new IGUPeluqueriaCanina(control);
        
        iguPeluqueria.setVisible(true);
        iguPeluqueria.setLocationRelativeTo(null);
        
    }
    
}
