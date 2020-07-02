package BubbleSort;

public class ArrayBub {
    private long[] a;
    private int numElements;

    public ArrayBub(int max) {
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

    public void bubbleSort() {
        int end, in;

        for (end = numElements - 1; end > 1; end--) {
            for (in = 0; in < end; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in+1);
                }
            }
        }
    }

    //Bi-Directional bubble sort
    public void biDirectionalBubbleSort() {
        int outRight, outLeft, in;

        for (outRight = numElements - 1, outLeft = 0; outRight > outLeft; outRight--, outLeft++) {
            for (in = outLeft; in < outRight; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in + 1);
                }
            }
            for (in = outRight - 1; in > outLeft; in--) {
                if (a[in] < a[in - 1]) {
                    swap(in, in - 1);
                }
            }
        }
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
