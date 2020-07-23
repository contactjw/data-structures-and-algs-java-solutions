package PriorityQueue;

public class SortedTest {
    public static void main(String[] args) {
        PriorityQueue pQueue = new PriorityQueue();

        pQueue.add(11);
        pQueue.display();
        pQueue.add(99);
        pQueue.display();
        pQueue.add(33);
        pQueue.display();
        pQueue.add(2);
        pQueue.display();

        System.out.println("Removed " + pQueue.remove());
        pQueue.display();
        System.out.println("Removed " + pQueue.remove());
        pQueue.display();
    }
}
