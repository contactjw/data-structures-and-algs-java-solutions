package Queue;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int numItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        numItems = 0;
    }

    public void insert(long num) {
        if(rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = num;
        numItems++;
    }


}
