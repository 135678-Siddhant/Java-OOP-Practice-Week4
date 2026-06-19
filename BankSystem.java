class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " | Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    private static final double THRESHOLD = 1000.0;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < THRESHOLD) {
            System.out.println("Withdrawal Denied: Balance cannot fall below the safety threshold of $" + THRESHOLD);
        } else {
            super.withdraw(amount);
        }
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest Added: $" + interest);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SAV-9921", 1500.0, 0.05);
        System.out.println("Initial Balance: $" + sa.getBalance());
        
        sa.deposit(200.0);
        sa.addInterest();
        sa.withdraw(500.0);
        sa.withdraw(600.0); // Should be denied due to threshold rules
    }
}