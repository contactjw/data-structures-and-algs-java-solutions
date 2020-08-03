package CircularLinkedList;

public class CircularTest {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(55);

        list.display();
        list.getCurrent();

        list.insert(1);
        list.insert(93);
        list.insert(106);
        list.insert(35);

        list.getCurrent();
        list.display();

        list.find(10);

        list.delete();
        list.display();

        list.getCurrent();
        list.step();
        list.step();
        list.step();

        list.delete();
        list.display();

    }
}
