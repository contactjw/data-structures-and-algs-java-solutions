package ProceduralArray;
// This has some bad coding standards, simply modified what the other had...

public class ArrayApp {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int searchKey;         // Key of item to search for
        int i;                 // Loop counter
        int numElements = 4;

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        searchKey = 44;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == searchKey)
                break;
        }
        if (i == arr.length)
            System.out.println("Can't find " + searchKey);
        else {
            System.out.println("Found " + searchKey);
        }

        searchKey = 99;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == searchKey)
                break;
        }
        for (int k = i; k < (arr.length - 1); k++) {
            arr[k] = arr[k+1];
        }
        numElements--;

        for (i = 0; i < numElements; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
    }
}
