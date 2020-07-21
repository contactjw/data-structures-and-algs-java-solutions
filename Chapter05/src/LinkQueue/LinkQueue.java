package LinkQueue;

public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue() {
        theList = new FirstLastList();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void insert(long dd) {
        theList.insertLast(dd);
    }

    public long remove() {
        return theList.deleteFirst();
    }

    public void displayQueue() {
        System.out.print("Queue (first-->last): ");
        theList.displayList();
    }
}
