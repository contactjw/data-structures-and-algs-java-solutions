package InsertionSort;

public class InsertSortApp {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int maxSize = 10000;
        ArrayInsert arr = new ArrayInsert(maxSize);

        for (int i = 0; i < maxSize; i++) {
            long n = (long)(Math.random()*(maxSize - 1));
            arr.insert(n);
        }

        arr.display();

        arr.insertionSort();

        arr.display();

        long endTime = System.nanoTime() - startTime;
        System.out.println("Insertion sort took " + endTime + " to execute");

    }
}
