package RecursiveBinarySearch;

public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        return recFind(searchKey, 0, nElems - 1);
    }

    private int recFind(long searchKey, int lowerBound, int upperBound) {
        int curIn;

        curIn = (lowerBound + upperBound) / 2;
        if (a[curIn] == searchKey)
            return curIn;
        else if (lowerBound > upperBound)
            return nElems;
        else {
            if (a[curIn] < searchKey)
                return recFind(searchKey, curIn + 1, upperBound);
            else
                return recFind(searchKey, lowerBound, curIn - 1);
        }
    }

    public void insert(long value) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (a[i] > value)
                break;
        }
        for (int j = nElems; j > i; j--) {
            a[j] = a[j - 1];
        }
        a[i] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }
}
