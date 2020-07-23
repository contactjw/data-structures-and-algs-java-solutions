package DequeDoublyLinked;

public class DequeApp {
    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.displayForward();

        deque.addFirst(11);
        deque.displayForward();
        deque.addFirst(22);
        deque.displayForward();
        deque.addFirst(33);
        deque.displayForward();
        deque.addLast(99);
        deque.displayForward();
        deque.addFirst(77);
        deque.displayForward();
        deque.addLast(88);
        deque.displayForward();

        System.out.println("\nDisplaying deque backwards");
        deque.displayBackward();
        System.out.println("");

        System.out.println("\nDisplaying deque forwards");
        deque.displayBackward();
        System.out.println("");

        System.out.println("Removing " + deque.removeFirst() + " from front");
        deque.displayForward();
        System.out.println("Removing " + deque.removeLast() + " from back");
        deque.displayForward();
        System.out.println("Removing " + deque.removeLast() + " from back");
        deque.displayForward();
        System.out.println("Removing " + deque.removeFirst() + " from front");
        deque.displayForward();

    }
}
