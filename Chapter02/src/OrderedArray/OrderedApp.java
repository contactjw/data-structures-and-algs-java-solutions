package OrderedArray;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 10;
        OrdArray arr1 = new OrdArray(maxSize);
        OrdArray arr2 = new OrdArray(maxSize);


        //This is to show automatic ordering from lowest to highest insertion.
        arr1.insert(19);
        arr1.insert(17);
        arr1.insert(15);
        arr1.insert(13);
        arr1.insert(11);
        arr1.insert(9);
        arr1.insert(7);
        arr1.insert(5);
        arr1.insert(3);
        arr1.insert(1);

        arr2.insert(2);
        arr2.insert(4);
        arr2.insert(6);
        arr2.insert(8);
        arr2.insert(10);
        arr2.insert(12);
        arr2.insert(14);
        arr2.insert(16);
        arr2.insert(18);
        arr2.insert(20);

        int searchKey = 5;

        if (arr1.binarySearch(searchKey) != arr1.size()) {
            System.out.println("Found " + searchKey);
        }
        else {
            System.out.println("Can't find " + searchKey);
        }

        arr1.display();
        arr2.display();
//        if (arr1.delete(00)) {
//            System.out.println("Properly deleted: 00");
//        }
//        if (arr1.delete(55)) {
//            System.out.println("Properly deleted: 55");
//        }
//        if (arr1.delete(99)) {
//            System.out.println("Properly deleted: 99");
//        }
//        arr1.display();


        OrdArray mergedArr = OrdArray.merge(arr1, arr2);
        mergedArr.display();

    }
}
