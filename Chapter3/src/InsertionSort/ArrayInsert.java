package InsertionSort;

public class ArrayInsert {
    private long[] a;
    private int numElements;

    public ArrayInsert(int max) {
        a = new long[max];
        numElements = 0;
    }

    public void insert(long value) {
        a[numElements] = value;
        numElements++;
        insertionSort();
    }

    public void display() {
        insertionSort();
        for (int i = 0; i < numElements; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public long median() {
        insertionSort();
        return a[(numElements - 1)/2];
    }

    public void noDups() {
        insertionSort();
        int toDelete = 0;

        for (int i = 0, j = 1; j < numElements; j++) {
            if (a[i] == a[j]) {
                toDelete++;
            }
            else {
                i++;
                a[i] = a[j];
            }
        }

        numElements -= toDelete;
    }

    public void insertionSort() {
        int in, out;

        System.out.println("Doing insertion sort...");
        for (out = 1; out < numElements; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in-1] >= temp) {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }

    public void insertionSortCopies() {
        int in, out;
        int numCopies = 0;
        int numComparisons = 0;

        System.out.println("Doing insertion sort...");
        for (out = 1; out < numElements; out++) {
            long temp = a[out];
            numCopies++;
            in = out;
            while (in > 0 ) {
                numComparisons++;
                if (a[in-1] >= temp) {
                    numComparisons++;
                    a[in] = a[in-1];
                    numCopies++;
                    --in;
                }
                else {
                    numComparisons++;
                    break;
                }
            }
            a[in] = temp;
            numCopies++;
        }
        System.out.println("Number of copies made: " + numCopies);
        System.out.println("Number of comparisons made: " + numComparisons);
    }
}
