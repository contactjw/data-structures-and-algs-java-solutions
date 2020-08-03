package CircularLinkedList;

public class CircularLinkedList {
    public Node current;

    public CircularLinkedList() {
        current = null;
    }

    public boolean isEmpty() {
        return (current == null);
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        System.out.println("Inserting " + data);
        if (current == null) {
            current = newNode;
            newNode.next = newNode;
        }
        else {
            newNode.next = current.next;
            current.next = newNode;
            current = newNode;
        }
    }

    public void delete() {
        Node temp = current;
        System.out.println("Deleting " + current.data);
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
    }

    public void find(int data) {
        Node temp = current;
        boolean found = false;
        do {
            temp = temp.next;
            if (temp.data == data) {
                found = true;
                break;
            }
        } while (temp != current);
        if (found)
            System.out.println("We found " + data);
        else
            System.out.println(data + " was not found");
    }

    public void display() {
        Node temp = current;
        if (current != null) {
            do {
                temp = temp.next;
                System.out.print(temp.data + " ");
            } while (temp != current);
        }
        System.out.println("");
    }

    public void getCurrent() {
        System.out.println("Current: " + current.data);
    }

    public void step() {
        current = current.next;
        System.out.println("Stepping: current node is now " + current.data);
    }
}
