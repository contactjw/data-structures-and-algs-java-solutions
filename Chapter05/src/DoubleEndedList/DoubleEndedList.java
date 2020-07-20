package DoubleEndedList;

public class DoubleEndedList {
    private Link first;
    private Link last;

    public DoubleEndedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long dd) {
        Link newLink = new Link(dd);

        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;           //Assign the newLink.next to the current firstLink
        first = newLink;                //Assign first to the newLink
    }

    public void insertLast(long dd) {
        Link newLink = new Link(dd);

        if (isEmpty()) {
            first = newLink;
        }
        last.next = newLink;
        last = newLink;
    }

    public long deleteFirst() {
        long temp = -1L;
        if (!this.isEmpty()) {
            temp = first.dData;
            if (first.next == null) {
                last = null;
            }
            first = first.next;
        }
        return temp;
    }

    public void displayList() {
        System.out.print("List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
