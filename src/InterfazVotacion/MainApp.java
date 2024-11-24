
package InterfazVotacion;

import mesaElectoral.MesaVotacion;

public class MainApp {
    public static void main(String[] args) {
        MesaVotacion mesaVotacion = MesaVotacion.getInstance(); // Crear instancia única
        Votar votar = new Votar(); // Crear instancia de Votar

        mesaVotacion.setVotarFrame(votar); // Enlazar las ventanas

        mesaVotacion.setVisible(true); // Mostrar la ventana principal
    }
}