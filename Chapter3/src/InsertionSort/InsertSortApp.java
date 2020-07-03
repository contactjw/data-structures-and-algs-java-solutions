package InsertionSort;

public class InsertSortApp {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int maxSize = 11;
        ArrayInsert arr = new ArrayInsert(maxSize);

        for (int i = 0; i < maxSize; i++) {
            long n = (long)(Math.random()*(maxSize - 1));
            arr.insert(n);
        }

        System.out.println("Starting array");
        arr.display();

        System.out.println("Doing insertion sort and removing duplicates at same time");
        arr.insertionSortRemoveDups();

//        Regular insertion sort
//        arr.insertionSort();
//
//        arr.display();
//
//        System.out.println("Getting rid of duplicate values");
//
//        arr.noDups();

        arr.display();

        System.out.println("Median value: " + arr.median());

        long endTime = System.nanoTime() - startTime;
        System.out.println("Insertion sort took " + endTime + " to execute");

    }
}
