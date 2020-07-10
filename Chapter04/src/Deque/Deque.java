package Deque;

public class Deque {
    private int maxSize;
    private int numItems;
    private int[] deque;
    private int front;
    private int rear;

    public Deque(int size) {
        maxSize = size;
        deque = new int[maxSize];
        front = 0;
        rear = -1;
        numItems = 0;
    }

    public void insert(int val) {
        if (numItems == maxSize) {
            System.out.println("the deque is full, " + val + " was not inserted");
            return;
        }
        deque[++rear] = val;
        numItems++;
    }

    public int remove() {
        System.out.println("removing " + peekFront() + " from deque");
        numItems--;
        return (deque[front++]);
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public int peekFront() {
        return deque[front];
    }

    public int size() {
        return numItems;
    }

    public void display() {
        int saveFront = front;

        for (int i = 0; i < numItems; i++) {
            System.out.print(peekFront() + " ");
            if (front == maxSize - 1) {
                front = -1;
            }
            front++;
        }
        front = saveFront;
        System.out.println("");
    }
}
