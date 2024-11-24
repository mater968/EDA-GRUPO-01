package GestionElecciones;

import TDA.ListaEnlazada;
import TDA.Nodo;

public class Gestion {
    private ListaEnlazada<Atributo> atributos;
    private int nroProfesores;
    
    public Gestion() {
        atributos = new ListaEnlazada<>();
    }
    
    public void insertar(Atributo atbt) {
        nroProfesores++;
        atbt.setId(nroProfesores);
        Nodo<Atributo> nuevoNodo = new Nodo<>(atbt);
        atributos.AddLast(nuevoNodo); // Agrega el nuevo nodo al final
    }
    
    public void actualizar(Atributo atbt) {
        Nodo<Atributo> actual = atributos.GetFirst();
        while (actual != null) {
            if (actual.getValue().getId() == atbt.getId()) {
                actual.setValue(atbt); // Actualiza el dato del nodo
                return;
            }
            actual = actual.getNext();
        }
    }
    
    public void remover(Atributo atbt) {
        // Asumiendo que ListaEnlazada tiene un método Remove implementado
        Nodo<Atributo> actual = atributos.GetFirst();
        Nodo<Atributo> anterior = null;
        while (actual != null) {
            if (actual.getValue().equals(atbt)) {
                if (anterior == null) {
                    atributos.SetFirst(actual.getNext());
                } else {
                    anterior.setNext(actual.getNext());
                }
                return;
            }
            anterior = actual;
            actual = actual.getNext();
        }
    }
    
    public Atributo buscar(int id) {
        Nodo<Atributo> actual = atributos.GetFirst();
        while (actual != null) {
            if (actual.getValue().getId() == id) {
                return actual.getValue(); // Retorna el atributo encontrado
            }
            actual = actual.getNext();
        }
        return null;
    }
    
    public ListaEnlazada<Atributo> getAtributos() {
        return atributos;
    }
}
