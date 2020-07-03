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
    }

    public void display() {
        for (int i = 0; i < numElements; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public long median() {
        return a[(numElements - 1)/2];
    }

    public void noDups() {
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

    public void insertionSortRemoveDups() {
        int in, out;

        for (out = 1; out < numElements; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in-1] >= temp) {
                if (a[in-1] == temp) {
                    temp = -1;
                }
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }


        int toDelete = 0;
        while (a[0] == -1) {
            toDelete++;
            for (int j = 0; j < numElements - 1; j++) {
                a[j] = a[j + 1];
            }
        }
        numElements -= toDelete;
    }
}
