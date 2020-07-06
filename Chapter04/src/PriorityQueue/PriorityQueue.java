package PriorityQueue;

public class PriorityQueue {
    private int maxSize;
    private long[] queArray;
    private int numItems;

    public PriorityQueue(int size) {
        maxSize = size;
        queArray = new long[maxSize];
        numItems = 0;
    }

    public void insert(long val) {
        int i;

        if (numItems == 0) {
            queArray[numItems++] = val;                 // If the queue is empty, just place in index 0
        }
        else {
            for (i = numItems - 1; i >= 0; i--) {       // Get the element at the front of the queue
                if (val > queArray[i]) {                // If the insert val is larger than the front of queue
                    queArray[i + 1] = queArray[i];      // Shift the front of the queue up one value
                }
                else {
                    break;                              // If the inserted val is not greater than the next element
                }                                       // break from the loop
            }
            queArray[i + 1] = val;                      // Place it in the empty slot that was made from shifts,
            numItems++;                                 // or place it in the very front of the queue
        }                                               // Increment number of items
    }

    public long remove() {
        return queArray[--numItems];                    // Remember to decrement first, numItems is 1 bigger than index
    }

    public long peekMin() {
        return queArray[numItems - 1];
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public boolean isFull() {
        return (numItems == maxSize);
    }
}
