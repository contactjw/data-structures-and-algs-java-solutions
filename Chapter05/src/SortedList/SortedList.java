package SortedList;

public class SortedList {
    private Link first;

    public SortedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(long key) {
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        // exit loop if we're at the end of the list, or if the key is less than the current data
        while (current != null && key > current.data) {
            previous = current;
            current = current.next;
        }
        // if there are no elements in the list, insert at first
        if (previous == null) {
            first = newLink;
        }
        // else set previous' link to newLink
        else {
            previous.next = newLink;
        }
        // always set the newLink's next to the current value
        newLink.next = current;
    }

    public Link remove() {
        // remove the first element in the list
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
