package LinkStack;

public class Link {
    public long dData;
    public Link next;

    public Link(long dd) {
        dData = dd;
        next = null;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
