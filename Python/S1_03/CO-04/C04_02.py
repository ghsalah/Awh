class Bank:
    def __init__(self, n, no,):
        self.name = n
        self.acc_no = no
        self.acc_type ="current account"
        self.balance = 1000
        
    def deposit(self):   
        amount = int(input("Enter the amount: "))
        self.balance += amount
        print("Current balance:", obj_bank.balance)
        
    def withdrawal(self):
        amount = int(input("Enter the withdrawal amount: "))
        if amount > self.balance:
            print("Insufficient balance")
        else:
            self.balance -= amount
            print("Current balance: ",self.balance)
            
    def display (self):
        print("Account Details:\nName:", self.name, "\nAccount Number:", self.acc_no, "\nAccount Type:", self.acc_type, "\nBalance:", self.balance)

name=input("Enter the name: ")
acc_no=int(input("Enter the account number: "))
obj_bank = Bank(name, acc_no)

while True:
    choice = int(input("1-Deposit 2-Withdrawal 3-Details 4-Exit\nEnter your choice: "))
    
    if choice == 1:
        obj_bank.deposit()
        
    elif choice == 2:
        obj_bank.withdrawal()

    elif choice == 3:
        obj_bank.display()

    elif choice == 4:
        print("__Exit__")
        break
    else:
        print("__Invalid choice__")
