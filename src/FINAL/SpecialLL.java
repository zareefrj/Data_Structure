package FINAL;

import java.util.ArrayList;
import java.util.Stack;

public class SpecialLL<E> {
    Node<E> head, tail;
    int size = 0;
     
    public SpecialLL() {}  
      
    public int getSize() {
        return size;
    }

    public void addFirst(E e) {
      Node<E> newNode = new Node<E>(e); 
      newNode.next = head; 
      head = newNode; 
      size++; 
      if (tail == null) 
        tail = head;
    }
    
    public void addLast(E e) {
      Node<E> newNode = new Node<E>(e); 
      if (tail == null) {
        head = tail = newNode; 
      }
      else {
        tail.next = newNode; 
        tail = tail.next; 
      }
      size++; 
    }

    public void print() {
        Node<E> current = head;
        for(int i=0; i<size; i++) {
            System.out.print(current.element + " ");   
             current=current.next;
        }
        System.out.println();
    }

    /** Append a method printOdd that returns nothing and accepts no argument. The method
     reads all the content of odd numbered nodes, and prints out each content followed by a
     blank space. Assume the first node (which has index 0) is numbered as 1.*/

    public void printOdd(){
        Node pointer=head;
        int count=1;
        while (pointer.next!=null){
            if(count==0)
                System.out.print(pointer.element+" ");

            if(count%2!=0)
                System.out.print(pointer.element+" ");

            pointer=pointer.next;

            count++;
        }
    }

    /**Append a method getEven that returns an ArrayList and accepts no argument. The
     ArrayList returned should store all the content of even numbered nodes in reverse
     order. Assume the first node (which has index 0) is numbered as 1. Refer to Figure 1 for
     clarification. In the case Illustrated by Figure 1, the ArrayList should store “f”, “d” and
     followed by “b” only. */

    public ArrayList getEven(){
        Node pointer=head;
        Stack stack=new Stack();
        ArrayList list=new ArrayList();

        int count=1;
        while (pointer.next!=null){

            if(count%2==0)
                stack.add(pointer.element);

            count++;
            pointer=pointer.next;
        }
        stack.add(pointer.element);

        while(!stack.isEmpty())
            list.add(stack.pop());

        return list;
    }

}
