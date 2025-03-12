import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;
    private String accountType;

    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);
        
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Account Type: " + myAccount.getAccountType());
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
