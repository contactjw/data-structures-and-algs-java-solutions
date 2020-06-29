package OrderedArray;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        int searchKey = 55;

        if (arr.find(searchKey) != arr.size()) {
            System.out.println("Found " + searchKey);
        }
        else {
            System.out.println("Can't find " + searchKey);
        }

        arr.display();
        if (arr.delete(00)) {
            System.out.println("Properly deleted: 00");
        }
        if (arr.delete(55)) {
            System.out.println("Properly deleted: 55");
        }
        if (arr.delete(99)) {
            System.out.println("Properly deleted: 99");
        }

        arr.display();

    }
}
