package InterIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterIterApp {
    public static void main(String[] args) throws IOException {
        LinkList list = new LinkList();
        ListIterator iter1 = list.getIterator();
        long value;

        iter1.insertAfter(20);
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);

        while(true) {
            System.out.println("Enter first letter of show list, reset iterator, next link, ");
            System.out.print("get current link, before (insert), after (insert), delete (current), exit: ");
            System.out.flush();
            char choice = getChar();
            switch(choice) {
                case 's':
                    if(!list.isEmpty()) {
                        list.displayList();
                    }
                    else {
                        System.out.println("List is empty");
                    }
                    break;
                case 'r':
                    iter1.reset();
                    break;
                case 'n':
                    if(!list.isEmpty() && !iter1.atEnd()) {
                        iter1.nextLink();
                    }
                    else {
                        System.out.println("Can't go to next link");
                    }
                    break;
                case 'g':
                    if(!list.isEmpty()) {
                        value = iter1.getCurrent().data;
                        System.out.println("Returned " + value);
                    }
                    else {
                        System.out.println("List is empty");
                    }
                    break;
                case 'b':
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();
                    iter1.insertBefore(value);
                    break;
                case 'a':
                    System.out.print("Enter a value to insert: ");
                    System.out.flush();
                    value = getInt();
                    iter1.insertAfter(value);
                    break;
                case 'd':
                    if(!list.isEmpty()) {
                        value = iter1.deleteCurrent();
                        System.out.println("Deleted " + value);
                    }
                    else {
                        System.out.println("List is empty");
                    }
                    break;
                case 'e':
                    System.out.println("Program ending.  Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
