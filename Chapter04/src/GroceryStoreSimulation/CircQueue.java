package GroceryStoreSimulation;

public class CircQueue {
    private int maxSize;
    private Customer[] line;
    private int rear;
    private int front;
    private int numCustomers;

    public CircQueue(int lineSize) {
        maxSize = lineSize;
        line = new Customer[maxSize];
        front = 0;
        rear = -1;
        numCustomers = 0;
    }

    public void addCustomer() {
        if (numCustomers == maxSize) {
            return;
        }
        Customer c = new Customer();
        if(rear == maxSize - 1) {
            rear = -1;
        }
        line[++rear] = c;
        numCustomers++;
        return;
    }

    private void removeCustomer() {
        Customer temp = line[front++];
        if(front == maxSize)
            front = 0;
        numCustomers--;
        return;
    }

    public int decrementGroceries() {
        if (numCustomers == 0) {
            return -99;
        }
        line[0].numGroceries-=5;
        if(line[0].numGroceries < 1) {
            removeCustomer();
            return 1;
        }
        return -1;
    }

    public int size() {
        return numCustomers;
    }

    public boolean isEmpty() {
        return (numCustomers == 0);
    }

    public boolean isFull() {
        return (numCustomers == maxSize);
    }
}
