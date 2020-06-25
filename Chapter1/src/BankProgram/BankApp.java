package BankProgram;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100.00);

        System.out.print("Before transactions, ");
        account1.display();

        account1.deposit(74.35);
        account1.withdraw(20.00);

        System.out.print("After transactions, ");
        account1.display();
    }
}
