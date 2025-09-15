package ProblemStatements;
import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
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

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private boolean hasLoan;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
        this.hasLoan = false;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            hasLoan = true;
            System.out.println("Loan of " + amount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan not approved for " + getHolderName());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000 && !hasLoan;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private boolean hasLoan;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
        this.hasLoan = false;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            hasLoan = true;
            System.out.println("Loan of " + amount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan not approved for " + getHolderName());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 10000 && !hasLoan;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        SavingsAccount s1 = new SavingsAccount("SAV123", "Mahi", 8000);
        CurrentAccount c1 = new CurrentAccount("CUR456", "Mahi", 15000);

        accounts.add(s1);
        accounts.add(c1);

        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getAccountNumber() + ", Holder: " + acc.getHolderName() + ", Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                ((Loanable) acc).applyForLoan(5000);
            }
            System.out.println("-----------");
        }
    }
}

