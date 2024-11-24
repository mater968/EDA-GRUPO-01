package TDA;

public class Cola<T> { // Cola genérica
    private T[] C;
    private int MAX_SIZE;
    private int first;
    private int last;

    @SuppressWarnings("unchecked") // Para inicializar un arreglo genérico
    public Cola(int p_MAX_SIZE) {
        MAX_SIZE = p_MAX_SIZE;
        C = (T[]) new Object[MAX_SIZE]; // Casteo necesario para genéricos
        first = -1;
        last = -1;
    }

    public boolean isFull() {
        return (first == 0 && last == MAX_SIZE - 1) || first == last + 1;
    }

    public boolean isEmpty() {
        return first == -1 && last == -1;
    }

    public void enqueue(T value) {
        if (this.isFull()) {
            System.out.println("La cola está llena. No se puede agregar el valor.");
            return; // La cola está llena
        }
        if (last == MAX_SIZE - 1) {
            last = 0;
        } else {
            last++;
        }
        if (first == -1) { // Si es el primer elemento
            first = 0;
        }
        C[last] = value;
    }

    public T dequeue() {
        if (this.isEmpty()) {
            System.out.println("La cola está vacía. No se puede extraer un valor.");
            return null; // Si la cola está vacía
        }
        T value = C[first];
        if (first == last) { // Un solo elemento en la cola
            first = -1;
            last = -1;
        } else if (first == MAX_SIZE - 1) {
            first = 0;
        } else {
            first++;
        }
        return value;
    }

    public void printQueue() {
        if (!isEmpty()) {
            int i = first;
            while (i != last) {
                System.out.print(C[i] + " [" + i + "] -> ");
                i = (i + 1) % MAX_SIZE;
            }
            System.out.print(C[last] + " [" + last + "] -> ");
            System.out.println("");
        }
    }

    // Método para obtener el tamaño de la cola (opcional)
    public int size() {
        if (isEmpty()) return 0;
        if (first <= last) return last - first + 1;
        return MAX_SIZE - first + last + 1;
    }
}
