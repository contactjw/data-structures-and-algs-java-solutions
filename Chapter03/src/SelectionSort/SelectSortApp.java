package SelectionSort;

public class SelectSortApp {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int maxSize = 10000;
        ArraySelect arr = new ArraySelect(maxSize);

        for (int i = 0; i < maxSize; i++) {
            long n = (long)(Math.random()*(maxSize - 1));
            arr.insert(n);
        }

        arr.display();

        arr.selectionSort();

        arr.display();

        long endTime = System.nanoTime() - startTime;
        System.out.println("Select sort took " + endTime + " to execute");

    }
}
