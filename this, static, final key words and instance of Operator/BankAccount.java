package com.bridgelabz.oops.inbuiltfunction;

public class BankAccount {
	static String bankName = "ABC Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder Name: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
    public static void main(String[] args) {
    BankAccount acc1 = new BankAccount(101, "Alice", 5000);
    BankAccount acc2 = new BankAccount(102, "Bob", 3000);
    acc1.displayDetails();
    acc2.displayDetails();
    BankAccount.getTotalAccounts();
    }
}



