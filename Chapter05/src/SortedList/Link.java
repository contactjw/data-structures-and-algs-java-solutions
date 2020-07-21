package SortedList;

public class Link {
    public long data;
    public Link next;

    public Link(long data) {
        this.data = data;
        next = null;
    }

    public void displayLink() {
        System.out.print(data + " " );
    }

}
