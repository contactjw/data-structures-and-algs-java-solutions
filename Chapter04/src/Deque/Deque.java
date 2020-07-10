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
        front = 1;
        rear = -1;
        numItems = 0;

        for (int i = 0; i < maxSize; i++) {
            deque[i] = -99;
        }
    }

//    public void insert(int val) {
//        if (numItems == maxSize) {
//            System.out.println("the deque is full, " + val + " was not inserted");
//            return;
//        }
//        deque[++rear] = val;
//        numItems++;
//    }

    public void insertLeft(int val) {
        if (!isFull()) {
            if (front == 0) {
                front = maxSize;
            }
            if (deque[--front] != -99) {
                deque[front] = val;
            }
            else {
                deque[front] = val;
                numItems++;
            }
        }
        else {
            System.out.println("the deque is full, " + val + " was not inserted");
        }
    }

    public void insertRight(int val) {
        if (!isFull()) {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            if (deque[++rear] != -99) {
                deque[rear] = val;
            }
            else {
                deque[rear] = val;
                numItems++;
            }
        }
        else {
            System.out.println("the deque is full, " + val + " was not inserted");
        }
    }

//    public int remove() {
//        System.out.println("removing " + peekFront() + " from deque");
//        numItems--;
//        return (deque[front++]);
//    }

    public int removeLeft() {
        int retVal = deque[front++];
        if (front == maxSize) {
            front = 0;
        }
        System.out.println("removing " + retVal + " from front of deque");
        numItems--;
        return (retVal);
    }

    public int removeRight() {
        int retVal = deque[rear--];
        if (rear == -1) {
            rear = maxSize - 1;
        }
        System.out.println("removing " + retVal + " from rear of deque");
        numItems--;
        return (retVal);
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public boolean isFull() {
        return (numItems == maxSize);
    }

    public int peekFront() {
        return deque[front];
    }

    public int peekRear() {
        return deque[rear];
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
