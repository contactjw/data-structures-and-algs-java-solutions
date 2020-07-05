package Queue;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int numItems;

    public Queue(int size) {
        maxSize = size;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        numItems = 0;
    }

    public void insert(long num) {
        if(rear == maxSize - 1) {
            rear = -1;                  //Wrap around to the front of the array, -1 is non existent but we will change
        }
        queArray[++rear] = num;         //If we wrapped around, -1 will be incremented to 0, the first index.
        numItems++;
    }

    public long remove() {
        long temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        numItems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public boolean isFull() {
        return (numItems == maxSize);
    }

    public int size() {
        return numItems;
    }
}
