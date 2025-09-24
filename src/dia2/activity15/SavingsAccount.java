package dia2.activity15;

public class SavingsAccount extends Account {

    public SavingsAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    boolean withdraw(double amount) {
        if(amount <= getBalance()){
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
    
}
