package linkedList;

public class MyLinkedList {
    private Node head;
    public void add(int value) {
    if (head == null) {
        Node node = new Node();
        node.setValue(value);
        head = node;
    }
    else {
        Node node = new Node();
        node.setValue(value);
        head.setNext(node);
        node.setLast(head);
    }
    }

    public Node getHead() {
        return  head;
    }
}
