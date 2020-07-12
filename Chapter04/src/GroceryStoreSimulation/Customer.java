package GroceryStoreSimulation;

public class Customer {
    public int numGroceries;

    public Customer() {
        //Generate number of groceries between 1 and 20
        numGroceries = ((int)(Math.random() * 20) + 1);
    }

    public int getNumGroceries() {
        return numGroceries;
    }
}
