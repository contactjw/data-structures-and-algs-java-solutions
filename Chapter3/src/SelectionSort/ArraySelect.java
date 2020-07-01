package SelectionSort;

public class ArraySelect {
    private long[] a;
    private int numElements;

    public ArraySelect(int max) {
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

    public void selectionSort() {
        int min, in, out;

        for (out = 0; out < numElements - 1; out++) {
            min = out;
            for (in = out + 1; in < numElements; in++) {
                if (a[in] < a[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
