package mesaElectoral;

import TDA.ListaEnlazada;
import TDA.Nodo;

public class MesaElectoral {
    private int id;
    private String ubicacion;
    private int numeroMesa;
    private ListaEnlazada<String> miembros;  // Usamos ListaEnlazada para los miembros

    // Constructor
    public MesaElectoral(int id, String ubicacion, int numeroMesa) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.numeroMesa = numeroMesa;
        this.miembros = new ListaEnlazada<>();  // Inicializamos la lista enlazada
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public ListaEnlazada<String> getMiembros() {
        return miembros;
    }
    
    public void setId(int id) {
        this.id = id;
    }


    
    

public void asignarMiembro(String miembro) {
    // Verificar si el miembro ya está en la lista
    Nodo<String> current = miembros.GetFirst();
    while (current != null) {
        if (current.getValue().equals(miembro)) {
            System.out.println("El miembro ya está asignado a esta mesa.");
            return;  // Si ya está, no lo agregamos de nuevo
        }
        current = current.getNext();
    }

    // Si no está, lo agregamos al final de la lista
    Nodo<String> nuevoMiembro = new Nodo<>(miembro);  // Crear un nuevo nodo para el miembro
    miembros.AddLast(nuevoMiembro);  // Agregarlo al final de la lista
    System.out.println("Miembro asignado: " + miembro);
}


    // Método para eliminar un miembro de la mesa (sin usar Remove)
    public void eliminarMiembro(String miembro) {
        Nodo<String> current = miembros.GetFirst();
        Nodo<String> previous = null;

        // Buscar el miembro en la lista
        while (current != null) {
            if (current.getValue().equals(miembro)) {
                // Si es el primer nodo
                if (previous == null) {
                    miembros.SetFirst(current.getNext());  // Método SetFirst debe estar en la clase ListaEnlazada
                } else {
                    previous.setNext(current.getNext());  // Si no es el primero, ajustamos el enlace
                }
                System.out.println("Miembro eliminado: " + miembro);
                return;
            }
            previous = current;
            current = current.getNext();
        }

        System.out.println("Miembro no encontrado.");
    }

    @Override
    public String toString() {
        // Creamos una cadena con los miembros en formato de lista
        StringBuilder miembrosStr = new StringBuilder();
        Nodo<String> current = miembros.GetFirst();
        while (current != null) {
            miembrosStr.append(current.getValue()).append(", ");
            current = current.getNext();
        }

        // Eliminamos la última coma y espacio si existen
        if (miembrosStr.length() > 0) {
            miembrosStr.setLength(miembrosStr.length() - 2);
        }

        return "MesaElectoral [ID=" + id + ", Ubicación=" + ubicacion + ", Número de Mesa=" + numeroMesa +
                ", Miembros=" + miembrosStr + "]";
    }
}
