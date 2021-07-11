package DoublyLinkedList;

import SinglyLinkedList.Node;

public class DoublyLinkedList<E>{
    NodeDouble head, tail;  int size;
    NodeDouble pointer=null; //used in remote

    public DoublyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }

    public void addFirst(E e){
        NodeDouble temp=new NodeDouble(e,head,null);
        if(head!=null)
            head.prev=temp;
        head=temp;

        if(tail==null)
            tail=temp;
        size++;
        System.out.println("adding: "+e);
    }

    public void addLast(E e){
        NodeDouble temp=new NodeDouble(e,null,tail);
        if(tail!=null)
            tail.next=temp;
        tail=temp;

        if(head==null)
            head=temp;
        size++;
        System.out.println("adding: "+e);
    }

    public void add(int index, E e){
        if(index<0 || index>size)
            throw new IndexOutOfBoundsException();
        else if(index==0)
            addFirst(e);
        else if(index==size)
            addLast(e);
        else{
            NodeDouble current=head;
            for(int i=0;i<index;i++)
                current=current.next;

            NodeDouble temp=new NodeDouble(e,current.next,current);
            current.next=temp;
            temp.next.prev=temp;
            size++;
            System.out.println("adding: "+temp.data);
        }
    }

    public E removeFirst(){
        NodeDouble temp=head;
        head=temp.next;
        head.prev=null;
        size--;
        System.out.print("deleted: ");
        return (E) temp.data;
    }

    public E removeLast(){
        NodeDouble temp=tail;
        tail=temp.prev;
        tail.next=null;
        size--;
        return (E) ("deleted: "+temp.data);
    }

    public E remove(int index){
        E element=null;

        if(index<0||index>=size)
            throw new IndexOutOfBoundsException();
        else if(index==0)
            element=removeFirst();
        else if(index==size-1)
            element=removeLast();
        else {
            NodeDouble temp=head;
            for(int i=0;i<=index;i++)
                temp=temp.next;
            element= (E) temp.data;
            temp.next.prev=temp.prev;
            temp.prev.next=temp.next;
            temp.next=null;
            temp.prev=null;
            size--;
            System.out.print("deleted: ");
        }
        return element;
    }

    public void clear(){
        NodeDouble temp=head;
        while(head!=null){
            temp=head.next;
            head.prev=head.next=null;
            head=temp;
        }
        temp=null;
        tail.prev=tail.next=null;
        size=0;
    }

    public void iterateForward(){
        System.out.println("iterating forward..");
        NodeDouble current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;}
        //System.out.print(current.data+" ");
    }

    public void iterateBackward(){
        System.out.println("iterating backward..");
        NodeDouble current=tail;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.prev;}
       // System.out.print(current.data+" ");
    }

    public int getSize() {
        return size;
    }

    //remote control challenge part
    public E Volume(String a){
        if(pointer==null)
            pointer=head;

        if(a.equals("+") && pointer.next!=null )
            pointer=pointer.next;


        else if(a.equals("-") && pointer.prev!=null)
            pointer=pointer.prev;

        return (E) ("Volume: "+pointer.data+"\n");
    }

    public E Channel(String a){
        if(pointer==null){
            pointer=head;
            pointer.prev=tail;
            tail.next=head;
        }

        if(a.equals("+"))
            pointer=pointer.next;

        else if(a.equals("-"))
            pointer=pointer.prev;

        return (E) ("Channel: "+pointer.data+"\n");
    }

}