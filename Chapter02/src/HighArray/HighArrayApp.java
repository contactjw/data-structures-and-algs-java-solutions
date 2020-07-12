package HighArray;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(55);
        arr.insert(22);
        arr.insert(22);
        arr.insert(22);
        arr.insert(00);
        arr.insert(66);
        arr.insert(22);
        arr.insert(22);
        arr.insert(44);
        arr.insert(44);
        arr.insert(22);
        arr.insert(22);
        arr.insert(22);
        arr.insert(22);
        arr.insert(33);
        arr.insert(77);


        arr.display();

        int searchKey = 35;
        if (arr.find(searchKey)) {
            System.out.println("Found " + searchKey);
        }
        else {
            System.out.println("Can't find " + searchKey);
        }

        //This code inverses the regular array
//        HighArray inverseArray = new HighArray(maxSize);
//        int removedItem;
//        while (true){
//            removedItem = arr.removeMax();
//            if (removedItem == -1)
//                break;
//            System.out.println("Removing largest key in array: " + removedItem);
//            inverseArray.insert(removedItem);
//        }
//
//        inverseArray.display();
//
//        arr.delete(00);
//        arr.delete(55);
//        arr.delete(66);

        arr.noDups();
        arr.display();
    }
}
