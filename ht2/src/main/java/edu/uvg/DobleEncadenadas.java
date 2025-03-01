package edu.uvg;

/**
 * Clase que representa un nodo en una lista doblemente enlazada.
 * @param <T> Tipo de dato almacenado en el nodo.
 */
class DoubleNode<T> {
    T data;
    DoubleNode<T> next, prev;
    
    /**
     * Constructor del nodo.
     * @param data El dato a almacenar en el nodo.
     */
    public DoubleNode(T data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

/**
 * Implementación de una lista doblemente enlazada.
 * @param <T> Tipo de dato almacenado en la lista.
 */
public class DoubleLinkedList<T> implements IList<T> {
    private DoubleNode<T> head;
    private int size;
    
    /**
     * Constructor de la lista doblemente enlazada.
     */
    public DoubleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     * @param item El elemento a agregar.
     */
    @Override
    public void add(T item) {
        DoubleNode<T> newNode = new DoubleNode<>(item);
        if (head != null) head.prev = newNode;
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
        if (head != null) head.prev = null;
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