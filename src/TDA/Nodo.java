package TDA;

public class Nodo<T> { // Se usa un genérico T
    private T value;
    private Nodo<T> next;

    public Nodo(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Nodo<T> getNext() {
        return this.next;
    }

    public void setNext(Nodo<T> node) {
        this.next = node;
    }
}

