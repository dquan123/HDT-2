package edu.uvg;

/**
 * Clase que representa un nodo en una lista simplemente enlazada.
 * @param <T> Tipo de dato almacenado en el nodo.
 */
class Node<T> {
    T data;
    Node<T> next;
    
    /**
     * Constructor del nodo.
     * @param data El dato a almacenar en el nodo.
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * Implementación de una lista simplemente enlazada.
 * @param <T> Tipo de dato almacenado en la lista.
 */
public class SimpleEncadenadas<T> implements IList<T> {
    private Node<T> head;
    private int size;
    
    /**
     * Constructor de la lista simplemente enlazada.
     */
    public SimpleEncadenadas() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     * @param item El elemento a agregar.
     */
    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * Elimina y retorna el primer elemento de la lista.
     * @return El elemento eliminado.
     * @throws Exception Si la lista está vacía.
     */
    @Override
    public T remove() throws Exception {
        if (isEmpty()) throw new Exception("Lista vacía");
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    /**
     * Retorna el primer elemento de la lista sin eliminarlo.
     * @return El primer elemento de la lista.
     * @throws Exception Si la lista está vacía.
     */
    @Override
    public T getFirst() throws Exception {
        if (isEmpty()) throw new Exception("Lista vacía");
        return head.data;
    }

    /**
     * Verifica si la lista está vacía.
     * @return true si la lista está vacía, false en caso contrario.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Retorna el tamaño actual de la lista.
     * @return El número de elementos en la lista.
     */
    @Override
    public int size() {
        return size;
    }
}
