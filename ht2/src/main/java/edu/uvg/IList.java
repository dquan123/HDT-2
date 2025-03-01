package edu.uvg;

/**
 * Interfaz que define las operaciones básicas de una lista enlazada.
 * @param <T> Tipo de dato almacenado en la lista.
 */
public interface IList<T> {
    
    /**
     * Agrega un elemento a la lista.
     * @param item El elemento a agregar.
     */
    void add(T item);
    
    /**
     * Elimina y retorna el primer elemento de la lista.
     * @return El elemento eliminado.
     * @throws Exception Si la lista está vacía.
     */
    T remove() throws Exception;
    
    /**
     * Retorna el primer elemento de la lista sin eliminarlo.
     * @return El primer elemento de la lista.
     * @throws Exception Si la lista está vacía.
     */
    T getFirst() throws Exception;
    
    /**
     * Verifica si la lista está vacía.
     * @return true si la lista está vacía, false en caso contrario.
     */
    boolean isEmpty();
    
    /**
     * Retorna el tamaño actual de la lista.
     * @return El número de elementos en la lista.
     */
    int size();
}
