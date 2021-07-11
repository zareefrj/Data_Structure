package Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack <E>{
    ArrayList<E> list=new ArrayList<>();

    public void push(E e){
        list.add(e);
        System.out.println(e+" pushed");
    }

    public E pop(){
        E e= list.get(getSize()-1);
        list.remove(e);
        return e;
    }

    public E peak(){
        E e= list.get(getSize()-1);
        return e;
    }

    public int getSize(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public boolean search(E e){
        if(isEmpty())
            throw new EmptyStackException();

        else
            return list.contains(e);
    }

    @Override
    public String toString() {
        return "{" +
                list +
                '}';
    }

    //test github push

}