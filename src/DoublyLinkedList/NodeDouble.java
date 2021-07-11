package DoublyLinkedList;

public class NodeDouble<E>{
    E data; NodeDouble next, prev;

    public NodeDouble(E data,NodeDouble next,NodeDouble prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public NodeDouble(E data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
