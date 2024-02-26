package example.model;

public class SimpleBankAccountWithAtm implements BankAccount {

    private double balance;
    private final AccountHolder holder;
    private final int FEE = 1;

    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance) {
        this.balance = balance;
        this.holder = holder;
    }

    @Override
    public AccountHolder getHolder() {
        return this.holder;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(int userID, double amount) {
        this.balance = this.balance + amount - FEE;
    }

    @Override
    public void withdraw(int userID, double amount) {
        this.balance = this.balance - amount - FEE;
    }

}
