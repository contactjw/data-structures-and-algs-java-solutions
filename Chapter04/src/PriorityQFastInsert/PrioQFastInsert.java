package PriorityQFastInsert;

public class PrioQFastInsert {
    private int maxSize;
    private int[] que;
    private int numItems;

    public PrioQFastInsert(int size) {
        maxSize = size;
        que = new int[size];
        numItems = 0;
    }

    public void insert(int val) {
        if (numItems == maxSize) {
            System.out.println("priority queue is full, " + val + " not inserted");
            return;
        }
        que[numItems] = val;
        numItems++;
    }

    public int delete() {
        int minIndex = 0;

        if (numItems == 0) {
            System.out.println("the queue is currently empty");
            return -99;
        }

        for (int i = 0; i < numItems; i++) {
            if (que[i] < que[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println("removing smallest value " + que[minIndex] + " from the queue");

        for (int i = minIndex; i < numItems - 1; i++) {
            que[i] = que[i + 1];
        }

        numItems--;
        return que[minIndex];
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public boolean isFull() {
        return (numItems == maxSize);
    }

    public int peekIndex(int index) {
        return que[index];
    }

    public void display() {
        for (int i = 0; i < numItems; i++) {
            System.out.print(peekIndex(i) + " ");
        }
        System.out.println("");
    }
}
