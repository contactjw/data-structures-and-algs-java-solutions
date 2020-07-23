package PriorityQueue;

public class SortedList {
    public Node first;

    public SortedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertNode(int data) {
        Node newNode = new Node(data);
        Node previous = null;
        Node current = first;

        while (current != null && data > current.data) {
                previous = current;
                current = current.next;
        }
        if (previous == null) {
            first = newNode;
        }
        else {
            previous.next = newNode;
        }
        newNode.next = current;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
