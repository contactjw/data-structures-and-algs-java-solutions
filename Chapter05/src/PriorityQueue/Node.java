package PriorityQueue;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public void displayLink() {
        System.out.print(data + " ");
    }
}
