package DoubleEndedList;

public class DoubleEndedApp {
    public static void main(String[] args) {
        DoubleEndedList list = new DoubleEndedList();

        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);

        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);

        list.displayList();

        list.deleteFirst();
        list.deleteFirst();

        list.displayList();
    }
}
