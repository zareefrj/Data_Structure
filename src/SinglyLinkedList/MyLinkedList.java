package SinglyLinkedList;

import java.util.ArrayList;
import java.util.Random;

public class MyLinkedList<E> {
    Node head,tail; int size=0;

    public MyLinkedList() {
    }

    public void addFirst(E e){ //g
        Node node=new Node(e);
        if(head==null){
            head=node;size++;}
        else {
            node.next=head;
            head=node;size++;
        }
    }

    public void addLast(E e){ //h(i)
        Node node=new Node(e);size++;
        if(head==null)
            head=node;
        else {
            Node current = head;
            while(current.next!=null)
                current=current.next;
            current.next=node;
            node.next=null;
            tail=node;
        }
    }

    public void add(int index, E e){
        Node node=new Node(e);size++;

        if(index<0||index>size)
            System.out.println("invalid index");

        else if(index==0)
            addFirst((E) node);

        else if(index== size-1)
            addLast(e);

        else{
            Node current=head;
            for(int i=0;i<index-1;i++)
                current=current.next;
            node.next=current.next;
            current.next=node;
        }
    }

    public void removeFirst(){
        if(head==null)
            System.out.println("This list is void");
        else{
            Node current=head;
            System.out.println(current.data+" is removed");
            head=current.next;
            size--;}
    }

    public void removeLast(){
        if(head==null)
            System.out.println("This list is void");
        else{
            Node current=head;
            while(current.next!=tail)
                current=current.next;
            System.out.println(tail.data+" is removed");
            current.next=null;
            tail=current;
            size--;
        }
    }

    public void remove(int index){
        if(index<0||index>size)
            System.out.println("invalid index");

        else if(head==null)
            System.out.println("This list is void");

        else if(index==0)
            removeFirst();

        else{
            Node current=head;
            for(int i=0;i<index-1;i++)
                current=current.next;
            System.out.println(current.next.data+" is deleted");
            current.next=current.next.next;
            size--;
        }
    }

    public void add(E e){
        Node node=new Node(e);
        if(head==null){
            head=tail=node;size++;}
        else {
            Node current = head;
            while(current.next!=null)
                current=current.next;
            current.next=node;
            node.next=null;
            tail=node;
            size++;
        }
    }

    public boolean contains(E e){
        Node current=head;
        for(int i=0;i<size;i++)
            if(current.data==e)
                return true;
            else
                current=current.next;
        return false;
    }

    public E get(int index){
        Node current=head;
        int count=size;

        if(index<0||index>=size)
            return (E) "Invalid index";

        else if(index==0)
            getFirst();

        else if(index==count--)
            getLast();

        else{
            for(int i=0;i<size;i++)
                if(i==index)
                    return (E) current.data;
                else
                    current=current.next;

        }return (E) "Error";
    }

    public E getFirst(){
        return (E) head.toString();
    }

    public E getLast(){
        return (E) tail.data;
    }

    public int indexOf(E e){
        Node current=head;
        for(int i=0;i<size;i++)
            if(current.data.equals(e))
                return i;
            else
                if(i!=size-1)
                current=current.next;
        return -1;
    }

    public int lastIndexOf(E e){
        Node current=head;
        for(int i=0;i<size;i++)
            if(current.data==e)
                return size-1-i;
            else
                current=current.next;
        return -1;
    }

    public void clear(){
        head=null;
    }

    public void print(){
        if(head==null)
            System.out.println("this list is empty");
        else{
            Node n=head;
            System.out.print("The Linked List: ");
            while(n.next!=null) {
                System.out.print(n.data + " ");
                n=n.next;}
            System.out.print(n.data+"\nNo of elements:"+size);
        System.out.println();}
    }

    public void reverse(){
        Node n=head;
        ArrayList<Node> nodelist=new ArrayList<>();

        while(n.next!=null) {
                nodelist.add(n);n=n.next;}
        nodelist.add(n);
        System.out.print("\nReverse order: ");
        for(int i=nodelist.size()-1; i>=0; i--)
            System.out.print(nodelist.get(i).data+" ");
        System.out.println();
    }

    public E set(int index,E e){
        Node current=head;
        for(int i=0;i<size;i++)
            if(i==index)
                current.data=e;
            else
                current=current.next;
        return (E) current.data;
    }

    //Q2
    public E getMiddleValue(){
        int count=size;
        int index=(int) Math.round((count-1.0)/2.0);
        Node current=head;
        for(int i=0;i<size;i++)
            if(index==i)
                return (E) current.data;
            else
                current=current.next;
        return (E) "Error";
    }


    /* MISSION UNSUCCESSFUL!!
    public MyLinkedList<E> copyList() {
        MyLinkedList<E> newCopy=new MyLinkedList<>();
        Random r=new Random();
        int i=0;
        while (i!=size){
            int index=r.nextInt(size);
            E e=this.get(index);

            if(!newCopy.contains(e)){
                i++;
                newCopy.add(e);
            }

        }
        return newCopy;
    }*/
    }