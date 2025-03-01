package edu.uvg;

public class StackList<T> extends AbstractStack<T> {
    private IList<T> lista;

    public StackList(IList<T> lista){
        this.lista = lista;
    }

    @Override
    public void push(T item){
        lista.add(item);
    }

    @Override
    public T pop() throws Exception{
        return lista.remove();
    }

    @Override
    public T UltimoValor() throws Exception{
        if(isEmpty()) throw new Exception("Stack vacío");
        return lista.getFirst();
    }

    @Override
    public int size(){
        return lista.size();
    }
}
