package CircularLinkedStack;

public class CircularLinkedStack {
    CircularList list;

    public CircularLinkedStack() {
        list = new CircularList();
    }

    public void push(int data) {
        System.out.println("Inserting " + data);
        list.insert(data);
    }

    public int pop() {
        return list.delete().data;
    }

    public void displayStack() {
        list.display();
    }
}
