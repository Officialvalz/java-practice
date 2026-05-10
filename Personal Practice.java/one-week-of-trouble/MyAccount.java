import java.util.Scanner;

public class MyAccount {

    private double balance;
    private String pin;

    public Account(double balance, String pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful");
        }

        else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount, String enteredPin) {

        if (!pin.equals(enteredPin)) {
            System.out.println("Incorrect PIN");
        }

        else if (amount > balance) {
            System.out.println("Insufficient balance");
        }

        else if (amount <= 0) {
            System.out.println("Invalid amount");
        }

        else {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        }
    }

    public void checkBalance(String enteredPin) {

        if (pin.equals(enteredPin)) {
            System.out.println("Balance: " + balance);
        }

        else {
            System.out.println("Incorrect PIN");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account account = new Account(5000, "1234");

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter deposit amount: ");
                double amount = input.nextDouble();

                account.deposit(amount);
            }

            else if (choice == 2) {

                System.out.print("Enter withdrawal amount: ");
                double amount = input.nextDouble();

                System.out.print("Enter PIN: ");
                String pin = input.next();

                account.withdraw(amount, pin);
            }

            else if (choice == 3) {

                System.out.print("Enter PIN: ");
                String pin = input.next();

                account.checkBalance(pin);
            }

            else if (choice == 4) {
                System.out.println("Goodbye");
            }

            else {
                System.out.println("Invalid choice");
            }
        }
    }
}