package StackOnDeque;

public class StackDequeApp {
    public static void main(String[] args) {
        StackDeque stack = new StackDeque(5);
        int popVal = 0;

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();

        for (int i = 0; i < 3; i++) {
            popVal = stack.pop();
            if (popVal == -1) {
                System.out.println("Stack is empty, can't remove any more items");
            }
        }

        stack.display();

        stack.push(9);

        stack.display();

    }
}
