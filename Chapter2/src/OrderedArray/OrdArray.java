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

    public int getKeyAtPosition(int pos) {
        return a[pos];
    }

    public void setKeyAtPosition(int pos, int val) {
        a[pos] = val;
        numElements++;
    }

    public int binarySearch(int searchKey) {
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
                    upperBound = curIndex - 1;
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
        int currIndex = 0;

        while (true) {
            if (lowerBound > upperBound) {
                break;
            }

            currIndex = (lowerBound + upperBound) / 2;

            if (value > a[currIndex]) {
                lowerBound = currIndex + 1;
                currIndex++;
            }
            else {
                upperBound = currIndex - 1;
            }
        }


        for (int k = numElements; k > currIndex; k--) {
            a[k] = a[k-1];
        }

        a[currIndex] = value;
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


    public static OrdArray merge(OrdArray arr1, OrdArray arr2) {
        int size = arr1.size() + arr2.size();
        OrdArray mergeArr = new OrdArray(size);

        int index1 = 0;
        int index2 = 0;
        int counter = 0;

        while(index1 < arr1.size() && index2 < arr2.size()) {
            if (arr1.getKeyAtPosition(index1) < arr2.getKeyAtPosition(index2)) {
                mergeArr.setKeyAtPosition(counter, arr1.getKeyAtPosition(index1));
                index1++;
                counter++;
            }
            else if (arr2.getKeyAtPosition(index2) < arr1.getKeyAtPosition(index1)) {
                mergeArr.setKeyAtPosition(counter, arr2.getKeyAtPosition(index2));
                counter++;
                index2++;
            }
        }

        while (index1 < arr1.size()) {
            mergeArr.setKeyAtPosition(counter, arr1.getKeyAtPosition(index1));
            counter++;
            index1++;
        }

        while (index2 < arr2.size()) {
            mergeArr.setKeyAtPosition(counter, arr2.getKeyAtPosition(index2));
            counter++;
            index2++;
        }


        return mergeArr;
    }
}
