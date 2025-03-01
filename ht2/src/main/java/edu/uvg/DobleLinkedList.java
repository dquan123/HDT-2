package edu.uvg;

class DobleNode<T> {
    T data;
    DobleNode<T> next, prev;

    public DobleNode(T data){
        this.data= data;
        this.next = this.prev = null;
    }
}
public class DobleLinkedList<T> implements IList<T> {
    private DobleNode<T> head;
    private int size;

    public DobleLinkedList(){
        this.head= null;
        this.size = 0;
    }

    @Override
    public void add(T item){
        DobleNode<T> newNode= new DobleNode<>(item);
        if(head != null) head.prev= newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override
    public T remove() throws Exception{
        if(isEmpty()) throw new Exception("Lista vacía");
        T data = head.data;
        head= head.next;
        if(head != null) head.prev = null;
        size--;
        return data;
    }

    @Override
    public T getFirst() throws Exception{
        if (isEmpty()) throw new Exception("Lista vacía");
        return head.data;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public int size(){
        return size;
    }
    
}
