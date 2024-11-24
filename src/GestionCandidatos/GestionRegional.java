package GestionCandidatos;

import TDA.ListaEnlazada;
import TDA.Nodo;

public class GestionRegional {
    private ListaEnlazada listaRegionales;

    public GestionRegional() {
        listaRegionales = new ListaEnlazada();
    }

    public void insertar(Regional regional) {
        Nodo nuevoNodo = new Nodo(regional);
        listaRegionales.AddLast(nuevoNodo); // Se agrega al final de la lista enlazada
    }

    public Regional buscar(String dni) {
        Nodo actual = listaRegionales.GetFirst();
        while (actual != null) {
            Regional r = (Regional) actual.getValue();
            if (r.getDni().equals(dni)) {
                return r; // Devuelve el regional si coincide el DNI
            }
            actual = actual.getNext();
        }
        return null;
    }

    public void eliminar(String dni) {
        Nodo actual = listaRegionales.GetFirst();
        Nodo anterior = null;

        while (actual != null) {
            Regional r = (Regional) actual.getValue();
            if (r.getDni().equals(dni)) {
                if (anterior == null) {
                    listaRegionales.AddFirst(actual.getNext());
                } else {
                    anterior.setNext(actual.getNext());
                }
                return; // Elimina y sale
            }
            anterior = actual;
            actual = actual.getNext();
        }
    }

    public ListaEnlazada getListaRegionales() {
        return listaRegionales;
    }
}
