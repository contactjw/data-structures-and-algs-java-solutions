package LowArray;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int numElements = 0;
        int j;     //Loop counter

        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        numElements = 10;

        for (j = 0; j < numElements; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println("");

        int searchKey = 26;
        for (j = 0; j < numElements; j++) {
            if (arr.getElem(j) == searchKey) {
                break;
            }
        }
        if (j == numElements) {
            System.out.println("Can't find " + searchKey);
        }
        else {
            System.out.println("Found " + searchKey);
        }

        for (j = 0; j < numElements; j++) {
            if (arr.getElem(j) == 55)
                break;
        }

        for (int k = j; k < numElements; k++) {
            arr.setElem(k, arr.getElem(k + 1));
        }

        numElements--;

        for (j = 0; j < numElements; j++) {
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println("");
    }
}
