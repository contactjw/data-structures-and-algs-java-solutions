package PriorityQueue;

import java.io.IOException;

public class PriorityApp {
    public static void main(String[] args) throws IOException {

        PriorityQueue pQueue = new PriorityQueue(5);
        pQueue.insert(30);
        pQueue.insert(50);
        pQueue.insert(10);
        pQueue.insert(40);
        pQueue.insert(20);

        while (!pQueue.isEmpty()) {
            long item = pQueue.remove();
            System.out.print(item + " ");
        }
        System.out.println("");
    }

}
