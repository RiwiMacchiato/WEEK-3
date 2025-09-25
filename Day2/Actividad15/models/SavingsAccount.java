package models;

public class SavingsAccount extends Account {

    public SavingsAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false; // Cannot go below 0
    }
}
