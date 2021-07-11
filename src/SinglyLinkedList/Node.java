package SinglyLinkedList;

public class Node <E>{
    E data;Node next;

    public Node(E data) {
        this.data = data;
    }

    public Node() {}

    @Override
    public String toString() {
        return data+" ";
    }
}