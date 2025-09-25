package models;

public abstract class Account {
    protected String number;
    protected double balance;

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean withdraw(double amount);

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{number='" + number + "', balance=" + balance + "}";
    }
}
