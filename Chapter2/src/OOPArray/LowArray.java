package OOPArray;

public class LowArray {
    private int[] a;

    public LowArray(int size) {
        a = new int[size];
    }

    public void setElem(int index, int value) {
        a[index] = value;
    }

    public int getElem(int index) {
        return a[index];
    }
}
