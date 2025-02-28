package edu.uvg;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data= data;
        this.next = null;
    }
}

public class SingleLinkedList<T> implements IList<T> {
    private Node<T> head;
    private int size;

    public SingleLinkedList(){
        this.head= null;
        this.size= 0;
    }

    @Override
    public void add(T item){
        Node<T> newNode= new Node<> (item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override
    public T remove() throws Exception {
        if (isEmpty()) throw new Exception("Lista vacía");
        T data= head.data;
        head = head.next;
        size--;
        return data;
    }

    @Override
    public T getFirst () throws Exception {
        if(isEmpty()) throw new Exception("Lista vacía");
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
