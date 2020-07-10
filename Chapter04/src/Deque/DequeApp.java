package Deque;

public class DequeApp {
    public static void main(String[] args) {
        int maxSize = 5;
        Deque deque = new Deque(maxSize);

        System.out.print("testing if deque is empty: ");
        if(deque.isEmpty()) {
            System.out.println("deque is empty\n");
        }
        else {
            System.out.println("deque is not empty\n");
        }

        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertRight(4);
        deque.insertRight(5);
        deque.insertLeft(6);


        System.out.println("front of deque: " + deque.peekFront());

        System.out.println("the size of the deque is " + deque.size());

        deque.display();

        System.out.println("");


        System.out.println("front of deque: " + deque.peekFront());

        System.out.println("the size of the deque is " + deque.size());

        deque.removeLeft();

        deque.display();

        System.out.println("the size of the deque is now " + deque.size() + "\n");



        System.out.println("front of deque: " + deque.peekFront());

        System.out.println("the size of the deque is " + deque.size());

        deque.removeLeft();

        deque.display();

        System.out.println("the size of the deque is now " + deque.size() + "\n");




        System.out.println("rear of deque: " + deque.peekRear());

        System.out.println("the size of the deque is " + deque.size());

        deque.removeRight();

        deque.display();

        System.out.println("the size of the deque is now " + deque.size() + "\n");



    }
}
