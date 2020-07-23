package PriorityQueue;

public class PriorityQueue {
    private SortedList theList;

    public PriorityQueue() {
        theList = new SortedList();
    }

    public void add(int data) {
        System.out.println("Added " + data);
        theList.insertNode(data);
    }

    public int remove() {
        return theList.deleteFirst().data;
    }

    public void display() {
        theList.displayList();
    }
}
