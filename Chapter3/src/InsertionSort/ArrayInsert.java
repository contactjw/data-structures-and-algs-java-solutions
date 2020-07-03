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
        int lowerBound = 0;
        int upperBound = numElements - 1;
        int med = (lowerBound + upperBound)/2;
        return a[med];
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
