package dia2.activity15;

public class CreditAccount extends Account {

    public CreditAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    boolean withdraw(double amount) {
        if (amount <= getBalance() + 1000) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
    
}
