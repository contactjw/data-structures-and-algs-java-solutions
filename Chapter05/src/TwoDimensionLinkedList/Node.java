package TwoDimensionLinkedList;

public class Node {
    public int data;
    public Node next;
    public Node below;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.below = null;
    }

    public void display() {
        System.out.print(data + " ");
    }
}
