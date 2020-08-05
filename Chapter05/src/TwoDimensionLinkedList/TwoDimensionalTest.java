package TwoDimensionLinkedList;

public class TwoDimensionalTest {
    public static void main(String[] args) {
        TwoDimensionalList list = new TwoDimensionalList(7, 10);

        list.display();

        list.insertValue(1, 5, 9);
        list.display();

        list.insertValue(6, 1, 23);
        list.display();

        list.insertValue(7, 10, 42);
        list.display();

        list.insertValue(3, 2, 11);
        list.display();

    }
}
