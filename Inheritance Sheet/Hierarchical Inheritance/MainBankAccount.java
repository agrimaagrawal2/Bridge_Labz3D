package HierarchicalInheritance;
public class MainBankAccount {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("SA123", 50000, 4.5);
        CheckingAccount c1 = new CheckingAccount("CA456", 20000, 10000);
        FixedDepositAccount f1 = new FixedDepositAccount("FD789", 100000, 24);

        s1.displayAccountType();
        c1.displayAccountType();
        f1.displayAccountType();
    }
}
