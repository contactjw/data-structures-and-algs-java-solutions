package LinkQueue;

public class Link {
    public long dData;
    public Link next;

    public Link(long d) {
        dData = d;
        next = null;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
