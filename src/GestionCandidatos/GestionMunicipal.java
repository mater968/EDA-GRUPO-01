package GestionCandidatos;

import TDA.ListaEnlazada;
import TDA.Nodo;

public class GestionMunicipal {
    private ListaEnlazada listaMunicipales;

    public GestionMunicipal() {
        listaMunicipales = new ListaEnlazada();
    }

    public void insertar(Municipal municipal) {
        Nodo nuevoNodo = new Nodo(municipal);
        listaMunicipales.AddLast(nuevoNodo); // Se agrega al final de la lista enlazada
    }

    public Municipal buscar(String dni) {
        Nodo actual = listaMunicipales.GetFirst();
        while (actual != null) {
            Municipal m = (Municipal) actual.getValue();
            if (m.getDni().equals(dni)) {
                return m; // Devuelve el municipal si coincide el DNI
            }
            actual = actual.getNext();
        }
        return null;
    }

    public void eliminar(String dni) {
        Nodo actual = listaMunicipales.GetFirst();
        Nodo anterior = null;

        while (actual != null) {
            Municipal m = (Municipal) actual.getValue();
            if (m.getDni().equals(dni)) {
                if (anterior == null) {
                    listaMunicipales.AddFirst(actual.getNext());
                } else {
                    anterior.setNext(actual.getNext());
                }
                return; // Elimina y sale
            }
            anterior = actual;
            actual = actual.getNext();
        }
    }

    public ListaEnlazada getListaMunicipales() {
        return listaMunicipales;
    }
}


