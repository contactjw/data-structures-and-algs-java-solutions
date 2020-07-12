package GroceryStoreSimulation;

import com.sun.tools.javac.comp.Check;

import java.util.Scanner;

public class CheckoutApp {
    public static void main(String[] args) {
        int numLines = 3;               //Three lines in total
        int maxCustomers = 5;           //Five customers per line
        CheckoutQueue lines = new CheckoutQueue(numLines, maxCustomers);
        int choice;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add Customer");
            System.out.println("2. Pass 1 Minute");
            System.out.println("3. Display Lines");
            System.out.println("4. Quit");
            System.out.print(">: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    lines.addCustomer();
                    break;
                case 2:
                    lines.incrementTime();
                    break;
                case 3:
                    lines.display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
