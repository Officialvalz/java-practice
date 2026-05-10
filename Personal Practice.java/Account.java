public class Account {
    private double balance;
    private String pin;

    public Account(double initialBalance, String pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            return;
        if (amount > balance)
            return;
         balance -= amount;
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

    public String getPin() {
        return pin;
    }
}
