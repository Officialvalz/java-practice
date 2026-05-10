const prompt = require("prompt-sync")();

class MyAccount {

    constructor(balance, pin) {
        this.balance = balance;
        this.pin = pin;
    }

    deposit(amount) {

        if (amount > 0) {
            this.balance += amount;
            console.log("Deposit successful");
        }

        else {
            console.log("Invalid amount");
        }
    }

    withdraw(amount, enteredPin) {

        if (this.pin !== enteredPin) {
            console.log("Incorrect PIN");
        }

        else if (amount > this.balance) {
            console.log("Insufficient balance");
        }

        else if (amount <= 0) {
            console.log("Invalid amount");
        }

        else {
            this.balance -= amount;
            console.log("Withdrawal successful");
        }
    }

    checkBalance(enteredPin) {

        if (this.pin === enteredPin) {
            console.log("Balance:", this.balance);
        }

        else {
            console.log("Incorrect PIN");
        }
    }
}

let account = new Account(5000, "1234");

let choice = 0;

while (choice !== 4) {

    console.log("\n1. Deposit");
    console.log("2. Withdraw");
    console.log("3. Check Balance");
    console.log("4. Exit");

    choice = Number(prompt("Enter choice: "));

    if (choice === 1) {

        let amount = Number(prompt("Enter deposit amount: "));
        account.deposit(amount);
    }

    else if (choice === 2) {

        let amount = Number(prompt("Enter withdrawal amount: "));
        let pin = prompt("Enter PIN: ");

        account.withdraw(amount, pin);
    }

    else if (choice === 3) {

        let pin = prompt("Enter PIN: ");
        account.checkBalance(pin);
    }

    else if (choice === 4) {
        console.log("Goodbye");
    }

    else {
        console.log("Invalid choice");
    }
}