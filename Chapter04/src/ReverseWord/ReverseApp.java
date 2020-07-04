package ReverseWord;
import java.io.*;
import java.nio.Buffer;

public class ReverseApp {
    public static void main(String[] args) throws IOException{

        String input, output;
        while(true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }

            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed: " + output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
