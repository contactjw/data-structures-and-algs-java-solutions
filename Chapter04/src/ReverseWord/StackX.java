package ReverseWord;

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
        if (!this.isFull()) {
            stackArray[++top] = c;            //First increment and then insert item
        }
        else {
            System.out.println("Stack is full.");
        }
    }

    public char pop() {
        return stackArray[top--];           //Access the item then decrement top
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
