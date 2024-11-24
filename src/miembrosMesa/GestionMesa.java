package miembrosMesa;

import TDA.ListaEnlazada;
import TDA.Nodo;
import TDA.Cola;  // Importa la clase Cola

public class GestionMesa {
    private ListaEnlazada<Miembro> miembros; // Lista enlazada de Miembros
    private Cola<Miembro> colaMiembros;      // Cola de Miembros
    private int nroMiembros; // Mantiene un contador de miembros registrados
    
    public GestionMesa() {
        miembros = new ListaEnlazada<>(); // Inicializa la lista enlazada de miembros
        colaMiembros = new Cola<>(30);    // Inicializa la cola con un tamaño de 10 (ajústalo según sea necesario)
    }
    
    public void insertar(Miembro miembro) { 
        nroMiembros++;
        miembro.setId(nroMiembros); // Asigna un ID incremental
        Nodo<Miembro> nuevoNodo = new Nodo<>(miembro); 
        miembros.AddLast(nuevoNodo); // Agrega el nuevo miembro al final de la lista
        colaMiembros.enqueue(miembro); // También agrega el miembro a la cola
    }
    
    public void actualizar(Miembro miembro) {
        Nodo<Miembro> actual = miembros.GetFirst(); 
        while (actual != null) {
            if (actual.getValue().getDni().equals(miembro.getDni())) { 
                actual.setValue(miembro); // Actualiza el miembro
                return;
            }
            actual = actual.getNext();
        }
    }
    
    public void remover(Miembro miembro) { 
        Nodo<Miembro> actual = miembros.GetFirst();
        Nodo<Miembro> previo = null;

        while (actual != null) {
            if (actual.getValue().getDni().equals(miembro.getDni())) { 
                if (previo == null) { // Si es el primer nodo
                    miembros.AddFirst(actual.getNext());
                } else {
                    previo.setNext(actual.getNext());
                }
                // Si removemos un miembro, también lo eliminamos de la cola
                Cola<Miembro> nuevaCola = new Cola<>(30); // Creamos una nueva cola temporal
                while (!colaMiembros.isEmpty()) {
                    Miembro m = colaMiembros.dequeue();
                    if (!m.getDni().equals(miembro.getDni())) {
                        nuevaCola.enqueue(m); // Solo agregamos los miembros que no fueron eliminados
                    }
                }
                colaMiembros = nuevaCola; // Reemplazamos la cola antigua por la nueva
                return;
            }
            previo = actual;
            actual = actual.getNext();
        }
    }
    
    public Miembro buscar(String dni) { 
        Nodo<Miembro> actual = miembros.GetFirst();
        while (actual != null) {
            if (actual.getValue().getDni().equals(dni)) {
                return actual.getValue();
            }
            actual = actual.getNext();
        }
        return null;
    }
    
    public ListaEnlazada<Miembro> getMiembros() {
        return miembros; // Retorna la lista enlazada de miembros
    }

    // Método para obtener la cola de miembros
    public Cola<Miembro> getColaMiembros() {
        return colaMiembros;
    }
}
