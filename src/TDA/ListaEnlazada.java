package TDA;

public class ListaEnlazada<T> { // Se usa un genérico T

    private Nodo<T> first;

    public ListaEnlazada() {
        this.first = null;
    }

    // Agrega un nodo al principio de la lista
    public void AddFirst(Nodo<T> node) {
        node.setNext(this.first);
        this.first = node;
    }

    // Retorna el primer nodo de la lista
    public Nodo<T> GetFirst() {
        return this.first;
    }

    // Agrega un nodo al final de la lista
    public void AddLast(Nodo<T> node) {
        Nodo<T> currentNode = this.first;
        if (this.first == null) {
            this.first = node;
        } else {
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
    }

    // Agrega un valor al final de la lista sin necesidad de crear un nodo explícitamente
    public void addLast(T value) {
        Nodo<T> newNode = new Nodo<>(value);
        AddLast(newNode);
    }

    // Imprime los elementos de la lista
    public void printList() {
        Nodo<T> currentNode = this.first;
        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " -> ");
            currentNode = currentNode.getNext();
        }
        System.out.println("null");
    }

    // Cambia el primer nodo de la lista
    public void SetFirst(Nodo<T> first) {
        this.first = first;
    }

    // Retorna el tamaño de la lista
    public int size() {
        int count = 0;
        Nodo<T> currentNode = this.first;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }
    
    
}

