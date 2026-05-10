class Account:

    def __init__(self, balance, pin):
        self.balance = balance
        self.pin = pin

    def deposit(self, amount):

        if amount > 0:
            self.balance += amount
            print("Deposit successful")

        else:
            print("Invalid amount")

    def withdraw(self, amount, entered_pin):

        if self.pin != entered_pin:
            print("Incorrect PIN")

        elif amount > self.balance:
            print("Insufficient balance")

        elif amount <= 0:
            print("Invalid amount")

        else:
            self.balance -= amount
            print("Withdrawal successful")

    def check_balance(self, entered_pin):

        if self.pin == entered_pin:
            print("Balance:", self.balance)

        else:
            print("Incorrect PIN")


account = Account(5000, "1234")

choice = 0

while choice != 4:

    print("\n1. Deposit")
    print("2. Withdraw")
    print("3. Check Balance")
    print("4. Exit")

    choice = int(input("Enter choice: "))

    if choice == 1:

        amount = float(input("Enter deposit amount: "))
        account.deposit(amount)

    elif choice == 2:

        amount = float(input("Enter withdrawal amount: "))
        pin = input("Enter PIN: ")

        account.withdraw(amount, pin)

    elif choice == 3:

        pin = input("Enter PIN: ")
        account.check_balance(pin)

    elif choice == 4:
        print("Goodbye")

    else:
        print("Invalid choice")