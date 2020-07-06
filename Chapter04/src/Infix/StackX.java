package Infix;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        stackArray[++top] = c;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return (top + 1);
    }

    public char peekN(int index) {
        return stackArray[index];
    }

    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom-->top): ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(" ");
        }
        System.out.println("");
    }
}
