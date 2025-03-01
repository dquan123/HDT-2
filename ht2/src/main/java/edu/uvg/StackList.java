package edu.uvg;

/**
 * Implementación de una pila utilizando una lista enlazada.
 * @param <T> Tipo de dato almacenado en la pila.
 */
public class StackList<T> extends AbstractStack<T> {
    private IList<T> lista;

    /**
     * Constructor de la pila.
     * @param lista La lista enlazada que se utilizará como base para la pila.
     */
    public StackList(IList<T> lista){
        this.lista = lista;
    }

    /**
     * Agrega un elemento a la pila (Push).
     * @param item El elemento a agregar.
     */
    @Override
    public void push(T item){
        lista.add(item);
    }

    /**
     * Elimina y retorna el último elemento agregado a la pila (Pop).
     * @return El elemento eliminado.
     * @throws Exception Si la pila está vacía.
     */
    @Override
    public T pop() throws Exception{
        return lista.remove();
    }

    /**
     * Retorna el último valor agregado a la pila sin eliminarlo.
     * @return El último valor de la pila.
     * @throws Exception Si la pila está vacía.
     */
    @Override
    public T UltimoValor() throws Exception{
        if(isEmpty()) throw new Exception("Stack vacío");
        return lista.getFirst();
    }

    /**
     * Retorna el tamaño actual de la pila.
     * @return El número de elementos en la pila.
     */
    @Override
    public int size(){
        return lista.size();
    }
}