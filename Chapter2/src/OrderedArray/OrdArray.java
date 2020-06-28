package OrderedArray;

public class OrdArray {
    private int[] a;
    private int numElements;

    public OrdArray(int max) {
        a = new int[max];
        numElements = 0;
    }

    public int size() {
        return numElements;
    }

    public int find(int searchKey) {
        int lowerBound = 0;
        int upperBound = numElements - 1;
        int curIndex;

        while (true) {
            curIndex = (lowerBound + upperBound) / 2;
            if (a[curIndex] == searchKey) {
                return curIndex;
            }
            else if (lowerBound > upperBound) {
                return numElements;
            }
            else {
                if (searchKey < a[curIndex]) {
                    upperBound = curIndex + 1;
                }
                else {
                    lowerBound = curIndex + 1;
                }
            }
        }
    }

    public void insert(int value) {
        int lowerBound = 0;
        int upperBound = numElements - 1;
        int j = 0;

        while(true) {

            if(lowerBound > upperBound) break;
            j = (lowerBound + upperBound) / 2;

            if(value > a[j]) {
                lowerBound = j + 1;
                j++;
            }
            else upperBound = j - 1;
        }

        for(int k=numElements; k>j; k--)
            a[k] = a[k-1];

        a[j] = value;
        numElements++;
    }

    public boolean delete(int value) {
        int j = binarySearch(value);
        if (j == numElements) {
            return false;
        }
        else {
            for (int k = j; k < numElements; k++) {
                a[k] = a[k + 1];
            }
            numElements--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < numElements; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    public int binarySearch(int value) {
        int lowerBound = 0;
        int upperBound = numElements - 1;
        int currIndex;

        while (true) {
            currIndex = (upperBound + lowerBound) / 2;
            if (a[currIndex] == value) {
                return currIndex;
            }
            else if (lowerBound > upperBound) {
                return numElements;
            }
            else {
                if (value < a[currIndex]) {
                    upperBound = currIndex + 1;
                }
                else {
                    lowerBound = currIndex + 1;
                }
            }
        }
    }
}
