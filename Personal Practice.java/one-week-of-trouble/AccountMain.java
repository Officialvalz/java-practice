public class AccountMain{

    private double balance;
    private String pin;

    public Account(double initialBalance, String pin) {
        this.balance = Math.max(0, initialBalance);
        this.pin = pin;
	return pin;
    }

    public String deposit(double amount) {
        if (amount <= 0) {
            return "INVALID_AMOUNT";
        }

        balance += amount;
        return "SUCCESS";
    }

    public String withdraw(double amount) {
        if (amount <= 0) {
            return "INVALID_AMOUNT";
        }
        if (amount > balance) {
            return "INSUFFICIENT_FUNDS";
        }
        balance -= amount;
        return "SUCCESS";
    }

    public double getBalance() {
        return balance;
    }

    public String updatePin(String oldPin, String newPin) {
        if (newPin == null || newPin.isEmpty()) {
            return "INVALID_PIN";
        }
        if (newPin.length() < 4) {
            return "PIN_TOO_SHORT";
        }
        if (!this.pin.equals(oldPin)) {
            return "WRONG_PIN";
        }
        this.pin = newPin;
        return "SUCCESS";
    }

    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public static void main(String[] args) {
        Account account = new Account(5000, "1234");

        System.out.println(account.deposit(2000));
        System.out.println(account.deposit(-500));
        System.out.println("Balance: " + account.getBalance());

        System.out.println(account.withdraw(1000));
        System.out.println(account.withdraw(99999));
        System.out.println("Balance: " + account.getBalance());

        System.out.println(account.verifyPin("1234"));
        System.out.println(account.updatePin("1234", "5678"));
        System.out.println(account.verifyPin("5678"));
    }
}