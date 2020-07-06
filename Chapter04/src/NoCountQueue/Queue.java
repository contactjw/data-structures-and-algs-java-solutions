package NoCountQueue;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public Queue(int size) {
        maxSize = size + 1;                 // Set array 1 size larger than requested
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(long val) {
        if(rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = val;
    }

    public long remove() {
        long temp = queArray[front++];
        if(front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public long peek() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (rear + 1 == front);
    }

    public boolean isFull() {
        return ((rear + 2 == front) || (front + maxSize - 1 == rear));
    }

    public int size() {
        if (rear >= front) {
            return rear - front + 1;
        }
        else {
            return (maxSize - front) + (rear + 1);
        }
    }
}
