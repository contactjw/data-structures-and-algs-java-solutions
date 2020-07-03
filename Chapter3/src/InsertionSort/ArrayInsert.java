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
}
