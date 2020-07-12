package GroceryStoreSimulation;

public class CheckoutQueue {
    private CircQueue[] lines;
    private int maxSize;

    public CheckoutQueue(int numberOfLines, int maxCustomers) {
        maxSize = maxCustomers;
        lines = new CircQueue[numberOfLines];

        //Initialize the CircQueue values
        for (int i = 0; i < numberOfLines; i++) {
            lines[i] = new CircQueue(maxSize);
        }
    }

    public void addCustomer() {
        int minIndex = 0;
        boolean linesFull = true;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].size() < lines[minIndex].size() && lines[i].size() != maxSize) {
                minIndex = i;
            }
            if (lines[i].size() != maxSize) {
                linesFull = false;
            }
        }
        if (linesFull == false) {
            System.out.println("\nA customer joins line " + (minIndex + 1) + ".");
            lines[minIndex].addCustomer();
        }
        else {
            System.out.println("\nAll the lines are full.");
        }
        System.out.println("");
    }

    public void incrementTime() {
        int checkIfCustDone;
        System.out.println("");
        for (int i = 0; i < lines.length; i++) {
            checkIfCustDone = lines[i].decrementGroceries();
            if (checkIfCustDone == -99) {
                System.out.println("Line " + (i + 1) + " has no customers.");
            }
            if (checkIfCustDone == 1) {
                System.out.println("Customer finished on line " + (i + 1) + " serving next customer!");
            }
        }
        System.out.println("");
    }

    public void display() {
        System.out.println("");
        for (int i = 0; i < lines.length; i++) {
            System.out.println("Line " + (i + 1) + " has " + lines[i].size() + " customers.");
        }
        System.out.println("");
    }
}
