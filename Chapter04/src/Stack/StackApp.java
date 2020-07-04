package Stack;

public class StackApp {
    public static void main(String[] args) {

        StackX theStack = new StackX(4);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        // Top of Stack
        // 80
        // 60
        // 40
        // 20
        // Bottom of Stack

        while(!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
