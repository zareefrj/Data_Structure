package Q;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyQueue <E>{
    LinkedList<E> q=new LinkedList();

    public MyQueue(E[] e) {
        for(int i=0;i<e.length;i++)
            q.add(e[i]);
    }

    public MyQueue() {}

    public void enqueue(E e){
        if(q.isEmpty())
            q.addFirst(e);
        else
            q.add(e);
    }

    public E dequeue(){
        if(q.isEmpty())
            return (E) "This Queue is Empty";

        else{
            E e=q.removeFirst();
            return e;
        }
    }

    public E getElement(int i){
        return q.get(i);
    }

    public E peek(){
        return q.peekFirst();
    }

    public int getSize(){
        return q.size();
    }

    public boolean contains(E e){
        return q.contains(e);
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }

    public void add(E e,int index){
        q.add(index,e);
    }

    public int getIndex(E e){
        return q.indexOf(e);
    }
    @Override
    public String toString() {
        return "{" + q + '}';
    }
}
