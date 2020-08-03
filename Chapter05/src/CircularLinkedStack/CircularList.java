package CircularLinkedStack;

public class CircularList {
    Node current;

    public CircularList() {
        current = null;
    }

    public boolean isEmpty() {
        return (current == null);
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (current == null) {
            current = newNode;
            current.next = current;
        }
        else {
            newNode.next = current.next;
            current.next = newNode;
            current = newNode;
        }
    }

    public Node delete() {
        Node temp = current;
        Node toDelete = current;
        if (current.next == current) {
            current = null;
        }
        else {
            while (temp.next != current) {
                temp = temp.next;
            }
            temp.next = current.next;
            current = temp;
        }
        return toDelete;
    }

    public void display() {
        Node temp = current;
        if (temp != null) {
            do {
                temp = temp.next;
                temp.displayNode();
            } while (temp != current);
            System.out.println("");
        }
        else {
            System.out.println("List is empty");
        }
    }

    public void step() {
        current = current.next;
    }
}
