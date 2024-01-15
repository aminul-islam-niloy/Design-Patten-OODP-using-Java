public class SavingAccount implements Account {
    private int accountNumber;
    private int balance;

    public SavingAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into Saving Account #" + accountNumber);
            System.out.println("Current balance in Saving Account: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Saving Account #" + accountNumber);
            System.out.println("Current balance in Saving Account: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    @Override
    public void transfer(int amount, Account targetAccount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Transferred $" + amount + " from Saving Account #" + accountNumber + " to Account #"
                    + targetAccount.getAccountNumber());
            System.out.println("Current balance in Saving Account: $" + balance);
        } else {
            System.out.println("Invalid transfer amount or insufficient balance.");
        }
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
