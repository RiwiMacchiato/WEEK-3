package models;

public class CreditAccount extends Account {

    public CreditAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -1000) {
            balance -= amount;
            return true;
        }
        return false; // Cannot go below -1000
    }
}
