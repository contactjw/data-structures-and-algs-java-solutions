package DequeDoublyLinked;

public class DoublyLinkedList {
    public Node first;
    public Node last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            last = newNode;
        }
        else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            first = newNode;
        }
        else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public Node deleteFront() {
        Node temp = first;
        if(first.next == null) {
            last = null;
        }
        else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Node deleteBack() {
        Node temp = last;
        if (last.previous == null) {
            first = null;
        }
        else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public void displayFront() {
        Node current = first;

        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayRear() {
        Node current = last;

        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println("");
    }
}
