package Deque;

public class DequeApp {
    public static void main(String[] args) {
        int maxSize = 5;
        Deque deque = new Deque(maxSize);

        if(deque.isEmpty()) {
            System.out.println("deque is empty");
        }

        deque.insert(1);
        deque.insert(2);
        deque.insert(3);
        deque.insert(4);
        deque.insert(5);
        deque.insert(6);

        deque.display();

        System.out.println("front of deque: " + deque.peekFront());

        System.out.println("the size of the deque is " + deque.size());

        deque.remove();

        System.out.println("the size of the deque is now " + deque.size());

        System.out.println("front of deque: " + deque.peekFront());

    }
}
