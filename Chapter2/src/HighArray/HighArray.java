package HighArray;

public class HighArray {
    private int[] a;
    private int numElements;

    public HighArray(int max) {
        a = new int[max];
        numElements = 0;
    }

    public boolean find(int searchKey) {
        int j;
        for (j = 0; j < numElements; j++) {
            if (a[j] == searchKey) {
                break;
            }
        }
        if (j == numElements) {
            return false;
        }
        else {
            return true;
        }
    }

    public void insert(int value) {
        a[numElements] = value;
        numElements++;
    }

    public boolean delete(int value) {
        int j;
        for (j = 0; j < numElements; j++) {
            if (value == a[j]) {
                break;
            }
        }
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

    public int removeMax() {
        int highest = -1;
        int i;
        for (i = 0; i < numElements; i++) {
            if (numElements == 0) {
                return -1;
            }
            if (a[i] > highest) {
                highest = a[i];
            }
        }

        delete(highest);
        return highest;
    }
}
