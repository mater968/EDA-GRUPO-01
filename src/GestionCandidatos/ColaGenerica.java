package GestionCandidatos;

import TDA.Cola;

public class ColaGenerica<T> {
    private Cola cola;

    // Constructor con un tamaño máximo
    public ColaGenerica(int maxSize) {
        cola = new Cola(maxSize);
    }

    // Método para agregar elementos a la cola
    public void agregar(T elemento) {
        cola.enqueue(elemento); // Agrega el elemento a la cola
    }

    // Método para quitar un elemento de la cola
    public T quitar() {
        return (T) cola.dequeue(); // Devuelve el elemento extraído de la cola
    }

    // Método para imprimir la cola (opcional)
    public void imprimirCola() {
        cola.printQueue();
    }
}

