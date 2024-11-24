package mesaElectoral;

public class IniciarTabla {

    // Esta instancia se compartirá entre las ventanas para que los datos no se pierdan
    private static GestionMesasElectorales gestionMesas = new GestionMesasElectorales();

    // Método para obtener la instancia compartida de GestionMesasElectorales
    public static GestionMesasElectorales getGestionMesas() {
        return gestionMesas;
    }
}
