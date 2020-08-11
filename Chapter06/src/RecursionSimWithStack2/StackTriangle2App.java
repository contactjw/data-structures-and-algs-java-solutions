package RecursionSimWithStack2;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackTriangle2App {
    static int theNumber;
    static int theAnswer;
    static StackX theStack;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        stackTriangle();
        System.out.println("Triangle = " + theAnswer);
    }

    public static void stackTriangle() {
        theStack = new StackX(10000);
        theAnswer = 0;

        while (theNumber > 0) {
            theStack.push(theNumber);
            theNumber--;
        }
        while (!theStack.isEmpty()) {
            int newN = theStack.pop();
            theAnswer += newN;
        }
    }


    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException{
        String str = getString();
        return Integer.parseInt(str);
    }
}
