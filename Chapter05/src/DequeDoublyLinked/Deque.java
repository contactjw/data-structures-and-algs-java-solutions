package DequeDoublyLinked;

public class Deque {
    private DoublyLinkedList list;

    public Deque() {
        list = new DoublyLinkedList();
    }

    public void addFirst(int data) {
        System.out.println("Inserted " + data);
        list.insertFirst(data);
    }

    public void addLast(int data) {
        System.out.println("Inserted " + data);
        list.insertLast(data);
    }

    public int removeFirst() {
        return list.deleteFront().data;
    }

    public int removeLast() {
        return list.deleteBack().data;
    }

    public void displayForward() {
        list.displayFront();
    }

    public void displayBackward() {
        list.displayRear();
    }

}
