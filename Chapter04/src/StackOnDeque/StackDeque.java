package StackOnDeque;

public class StackDeque {
    private int maxSize;
    private int[] stack;
    private int numItems;
    private int front;
    private int rear;

    public StackDeque(int size) {
        maxSize = size;
        stack = new int[maxSize];
        numItems = 0;
        front = 0;
        rear = -1;
    }

    public void push(int val) {
        if (rear == maxSize - 1) {
            System.out.println("The stack is full");
            return;
        }
        System.out.println("Pushing " + val + " onto the top of the stack");
        stack[++rear] = val;
        numItems++;
    }

    public int pop() {
        if (numItems == 0) {
            return -1;
        }
        else {
            System.out.println("Removing " + peekTop() + " from top of stack");
            numItems--;
            return stack[rear--];
        }
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public boolean isFull() {
        return (numItems == maxSize);
    }

    public int peekTop() {
        return stack[rear];
    }

    public void display() {
        int saveRear = rear;
        for (int i = numItems; i > 0; i--) {
            System.out.print(peekTop() + " ");
            rear--;
        }
        System.out.println("");
        rear = saveRear;
    }
}
