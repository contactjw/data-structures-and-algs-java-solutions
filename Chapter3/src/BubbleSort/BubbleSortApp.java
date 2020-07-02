package BubbleSort;

public class BubbleSortApp {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int maxSize = 10000;
        ArrayBub arr = new ArrayBub(maxSize);

        for (int i = 0; i < maxSize; i++) {
            long n = (long)(Math.random()*(maxSize - 1));
            arr.insert(n);
        }

        arr.display();

        arr.bubbleSort();

        arr.display();

        long endTime = System.nanoTime() - startTime;
        System.out.println("Bubble sort took " + endTime + " to execute");
    }
}
