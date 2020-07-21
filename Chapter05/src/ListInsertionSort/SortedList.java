package ListInsertionSort;

public class SortedList {
    private Link first;

    public SortedList() {
        first = null;
    }

    public SortedList(Link[] linkArr) {
        first = null;
        for (int i = 0; i < linkArr.length; i++) {
            insert(linkArr[i]);
        }
    }

    public void insert(Link k) {
        Link previous = null;
        Link current = first;

        while (current != null && k.data > current.data) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = k;
        }
        else {
            previous.next = k;
        }
        k.next = current;
    }

    public Link remove() {
        Link temp = first;
        first = first.next;
        return temp;
    }
}
