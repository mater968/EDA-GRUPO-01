package miembrosMesa;

import TDA.ListaEnlazada;
import TDA.Nodo;

public class GestionDatos {

    private static GestionDatos instancia;
    private ListaEnlazada<Miembro> miembros;
    private ListaEnlazada<MesaActa> mesasActa;
    private ListaEnlazada<ActaElectoralData> actasElectorales; // Agregar lista para actas electorales

    private GestionDatos() {
        miembros = new ListaEnlazada<>();
        mesasActa = new ListaEnlazada<>();
        actasElectorales = new ListaEnlazada<>(); // Inicializar lista de actas electorales
    }

    public static GestionDatos getInstance() {
        if (instancia == null) {
            instancia = new GestionDatos();
        }
        return instancia;
    }

    // Métodos para gestionar Miembros
    public void agregarMiembro(Miembro miembro) {
        miembros.addLast(miembro);
    }

    public ListaEnlazada<Miembro> getMiembros() {
        return miembros;
    }

    // Métodos para gestionar Mesas Acta
    public void agregarMesaActa(MesaActa mesaActa) {
        mesasActa.addLast(mesaActa);
    }

    public MesaActa obtenerMesaActa(String numeroMesa) {
        Nodo<MesaActa> actual = mesasActa.GetFirst();
        while (actual != null) {
            MesaActa mesa = actual.getValue();
            if (mesa != null && mesa.getNumeroMesa().equals(numeroMesa)) {
                return mesa;
            }
            actual = actual.getNext();
        }
        return null;
    }

    public ListaEnlazada<String> obtenerNumerosMesas() {
        ListaEnlazada<String> numerosMesas = new ListaEnlazada<>();
        Nodo<MesaActa> actual = mesasActa.GetFirst();

        while (actual != null) {
            numerosMesas.addLast(actual.getValue().getNumeroMesa());
            actual = actual.getNext();
        }

        return numerosMesas;
    }

    // Métodos para gestionar Actas Electorales
    public void guardarActaElectoral(String nombre, String partidoPolitico, int votos, int votosBlanco, int votosNulo) {
        ActaElectoralData acta = new ActaElectoralData(nombre, partidoPolitico, votos, votosBlanco, votosNulo);
        actasElectorales.addLast(acta);
    }

    public void modificarActaElectoral(int index, String nombre, String partidoPolitico, int votos, int votosBlanco, int votosNulo) {
        Nodo<ActaElectoralData> actual = actasElectorales.GetFirst();
        int contador = 0;

        while (actual != null) {
            if (contador == index) {
                ActaElectoralData acta = actual.getValue();
                acta.setNombre(nombre);
                acta.setPartidoPolitico(partidoPolitico);
                acta.setVotos(votos);
                acta.setVotosBlanco(votosBlanco);
                acta.setVotosNulo(votosNulo);
                break;
            }
            actual = actual.getNext();
            contador++;
        }
    }
/*
    public void eliminarActaElectoral(int index) {
        Nodo<ActaElectoralData> actual = actasElectorales.GetFirst();
        int contador = 0;

        while (actual != null) {
            if (contador == index) {
                actasElectorales.remove(actual.getValue());
                break;
            }
            actual = actual.getNext();
            contador++;
        }
    }
*/
    public ListaEnlazada<ActaElectoralData> obtenerActasElectorales() {
        return actasElectorales;
    }
}

