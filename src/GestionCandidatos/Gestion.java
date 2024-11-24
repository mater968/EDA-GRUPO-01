package GestionCandidatos;

import TDA.ListaEnlazada;
import TDA.Nodo;

public class Gestion {
    private ListaEnlazada listaPresidentes;

    public Gestion() {
        listaPresidentes = new ListaEnlazada();
    }

    public void insertar(Presidente presidente) {
        Nodo nuevoNodo = new Nodo(presidente);
        listaPresidentes.AddLast(nuevoNodo); // Se agrega al final de la lista enlazada
    }

    public Presidente buscar(String dni) {
        Nodo actual = listaPresidentes.GetFirst();
        while (actual != null) {
            Presidente p = (Presidente) actual.getValue();
            if (p.getDni().equals(dni)) {
                return p; // Devuelve el presidente si coincide el DNI
            }
            actual = actual.getNext();
        }
        return null;
    }

    public void eliminar(String dni) {
        Nodo actual = listaPresidentes.GetFirst();
        Nodo anterior = null;

        while (actual != null) {
            Presidente p = (Presidente) actual.getValue();
            if (p.getDni().equals(dni)) {
                if (anterior == null) {
                    listaPresidentes.AddFirst(actual.getNext());
                } else {
                    anterior.setNext(actual.getNext());
                }
                return; // Elimina y sale
            }
            anterior = actual;
            actual = actual.getNext();
        }
    }

    public ListaEnlazada getListaPresidentes() {
        return listaPresidentes;
    }
}
