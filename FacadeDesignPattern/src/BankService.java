import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, Account> bankAccounts;

    public BankService() {
        this.bankAccounts = new Hashtable<>();
    }

    public int createNewAccount(String type, int initBalance) {
        Account newAccount = null;
        switch (type.toLowerCase()) {
            case "saving":
                newAccount = new SavingAccount(this.bankAccounts.size(), initBalance);
                break;
            case "chequing":
                newAccount = new ChequingAccount(this.bankAccounts.size(), initBalance);
                break;
            case "investment":
                newAccount = new InvestmentAccount(this.bankAccounts.size(), initBalance);
                break;
            default:
                throw new IllegalArgumentException("Invalid account type: " + type);
        }

        this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
        return newAccount.getAccountNumber();
    }

    public void depositMoney(int accountNumber, int amount) {
        Account account = bankAccounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found for deposit");
        }
    }

    public void withdrawMoney(int accountNumber, int amount) {
        Account account = bankAccounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found for withdrawal");
        }
    }

    public void transferMoney(int senderAccountNumber, int receiverAccountNumber, int amount) {
        Account senderAccount = this.bankAccounts.get(senderAccountNumber);
        Account receiverAccount = this.bankAccounts.get(receiverAccountNumber);

        if (senderAccount != null && receiverAccount != null) {
            senderAccount.transfer(amount, receiverAccount);
        } else {
            System.out.println("Invalid sender or receiver account for transfer");
        }
    }
}
