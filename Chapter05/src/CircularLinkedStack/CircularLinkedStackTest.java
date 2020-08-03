package CircularLinkedStack;

public class CircularLinkedStackTest {
    public static void main(String[] args) {
        CircularLinkedStack stack = new CircularLinkedStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.displayStack();

        System.out.println("Popping: " + stack.pop());
        stack.displayStack();
        System.out.println("Popping: " + stack.pop());
        stack.displayStack();
        System.out.println("Popping: " + stack.pop());
        stack.displayStack();
        stack.push(9);
        stack.displayStack();
        stack.push(13);
        stack.displayStack();
        System.out.println("Popping: " + stack.pop());
        stack.displayStack();
    }
}
