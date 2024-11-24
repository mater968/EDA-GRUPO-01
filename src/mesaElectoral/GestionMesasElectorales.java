package mesaElectoral;

import TDA.Cola;  // Importa la cola
import TDA.ListaEnlazada;  // Importa la lista enlazada
import TDA.Nodo;
import miembrosMesa.Miembro;

public class GestionMesasElectorales {

    private ListaEnlazada<MesaElectoral> mesas;  // Lista enlazada para las mesas
    private Cola<Miembro> colaMiembros;  // Cola para los miembros

    // Constructor
    public GestionMesasElectorales() {
        this.mesas = new ListaEnlazada<>();  // Lista enlazada para las mesas
        this.colaMiembros = new Cola<>(100);  // Cola con un tamaño máximo
    }

    // Método para agregar miembros a la cola
    public void agregarMiembroACola(Miembro miembro) {
        colaMiembros.enqueue(miembro);  // Enqueue agrega el miembro al final de la cola
    }

    // Método para crear una mesa electoral
    public void crearMesa(int id, String ubicacion, int numeroMesa) {
        MesaElectoral nuevaMesa = new MesaElectoral(id, ubicacion, numeroMesa);
        mesas.AddLast(new Nodo<>(nuevaMesa));  // Añadir la mesa a la lista enlazada
        System.out.println("Mesa creada: " + nuevaMesa);
    }

    // Método para asignar un miembro a una mesa
    public void asignarMiembro(int id, String nombreMiembro) {
        MesaElectoral mesa = buscarMesa(id);
        if (mesa != null) {
            // Verificar si el miembro ya está asignado a la mesa
            boolean miembroAsignado = false;
            Nodo<String> nodoMiembro = mesa.getMiembros().GetFirst();
            while (nodoMiembro != null) {
                if (nodoMiembro.getValue().equals(nombreMiembro)) {
                    miembroAsignado = true;
                    break;
                }
                nodoMiembro = nodoMiembro.getNext();
            }

            if (!miembroAsignado) {
                // Asignar el primer miembro disponible de la cola
                Miembro miembro = colaMiembros.dequeue();
                if (miembro != null) {
                    mesa.asignarMiembro(miembro.getNombre() + " " + miembro.getApellidos());
                    System.out.println("Miembro asignado: " + nombreMiembro);
                } else {
                    System.out.println("No hay más miembros disponibles en la cola.");
                }
            } else {
                System.out.println("El miembro ya está asignado a la mesa.");
            }
        } else {
            System.out.println("Mesa no encontrada.");
        }
    }

    // Método para buscar una mesa por su ID
    public MesaElectoral buscarMesa(int id) {
    Nodo<MesaElectoral> nodo = mesas.GetFirst();
    while (nodo != null) {
        if (nodo.getValue().getId() == id) {
            return nodo.getValue();
        }
        nodo = nodo.getNext();
    }
    System.out.println("Mesa con ID " + id + " no encontrada.");
    return null;
}
    
    // Método para modificar una mesa electoral existente
public void modificarMesa(int idMesa, String nuevaUbicacion, int nuevoNumeroMesa) {
    // Buscar la mesa por ID
    MesaElectoral mesa = buscarMesa(idMesa);
    if (mesa != null) {
        // Si la mesa existe, se modifican los valores
        mesa.setUbicacion(nuevaUbicacion);  // Actualizar la ubicación
        mesa.setNumeroMesa(nuevoNumeroMesa);  // Actualizar el número de mesa
        System.out.println("Mesa modificada: " + mesa);
    } else {
        System.out.println("Mesa con ID " + idMesa + " no encontrada.");
    }
}


    // Método para listar todas las mesas
    public void listarMesas() {
        Nodo<MesaElectoral> nodo = mesas.GetFirst();
        while (nodo != null) {
            System.out.println(nodo.getValue());
            nodo = nodo.getNext();
        }
    }

    // Método para obtener todas las mesas, útil para la interfaz
    public ListaEnlazada<MesaElectoral> getMesas() {
        return mesas;
    }

    // Método para asignar hasta 3 miembros a una mesa electoral
    public void asignarMiembrosAUnaMesa(int id) {
    MesaElectoral mesa = buscarMesa(id);
    if (mesa != null) {
        int miembrosAsignados = 0;
        Nodo<String> nodoMiembro = mesa.getMiembros().GetFirst();
        // Verifica si ya tiene 3 miembros
        while (nodoMiembro != null && miembrosAsignados < 3) {
            miembrosAsignados++;
            nodoMiembro = nodoMiembro.getNext();
        }

        while (miembrosAsignados < 3) {
            Miembro miembro = colaMiembros.dequeue();
            if (miembro != null) {
                mesa.asignarMiembro(miembro.getNombre() + " " + miembro.getApellidos());
                miembrosAsignados++;
            } else {
                System.out.println("No hay más miembros disponibles en la cola.");
                break;
            }
        }
    }
}


    // Método para obtener la cola de miembros
    public Cola<Miembro> getColaMiembros() {
        return colaMiembros;  // Retorna la cola de miembros
    }

    
    
}


