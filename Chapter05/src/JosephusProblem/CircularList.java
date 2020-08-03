package JosephusProblem;

public class CircularList {
    private Node current;
    private int size;

    public CircularList() {
        current = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (current == null);
    }

    public int getSize() {
        return size;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        System.out.println("Inserting " + data);
        if (current == null) {
            current = newNode;
            current.next = current;
        }
        else {
            newNode.next = current.next;
            current.next = newNode;
            current = newNode;
        }
        size++;
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
        size--;
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
            System.out.println("The list is empty");
        }
    }

    public void step() {
        current = current.next;
    }

    public int getCurrent() {
        return current.data;
    }


}
