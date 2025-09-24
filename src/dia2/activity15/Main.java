package dia2.activity15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new CreditAccount("C123", 500));
        accounts.add(new SavingsAccount("S123", 500));

        
        for (Account acc : accounts) {
            System.out.println("Número de cuenta: " + acc.getNumber());
            System.out.println("Saldo inicial: $" + acc.getBalance());
            if(acc instanceof CreditAccount) {
                System.out.println("Tipo de cuenta: Cuenta de Crédito");
            } else if(acc instanceof SavingsAccount) {
                System.out.println("Tipo de cuenta: Cuenta de Ahorros");
            }
            boolean success = acc.withdraw(600);
            if (success) {
                System.out.println("Retiro exitoso de $600");
            } else {
                System.out.println("Fondos insuficientes para el retiro de $600");
            }
            System.out.println("Saldo final: $" + acc.getBalance());
            System.out.println("---------------------------");
        }
    }
}
