import java.util.ArrayList;
import models.Account;
import models.SavingsAccount;
import models.CreditAccount;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Account> accounts = new ArrayList<>();

        // Add different types of accounts
        accounts.add(new SavingsAccount("SAV001", 500.0));
        accounts.add(new CreditAccount("CRE001", 200.0));
        accounts.add(new SavingsAccount("SAV002", 100.0));

        System.out.println("Initial account states:");
        for (Account account : accounts) {
            System.out.println("- " + account);
        }

        System.out.println("\n=== Testing Withdrawals ===");

        // Test valid withdrawals
        System.out.println("\n1. Valid withdrawals:");
        testWithdrawal(accounts.get(0), 200.0); // Savings: 500 - 200 = 300
        testWithdrawal(accounts.get(1), 300.0); // Credit: 200 - 300 = -100
        testWithdrawal(accounts.get(2), 50.0);  // Savings: 100 - 50 = 50

        // Test invalid withdrawals
        System.out.println("\n2. Invalid withdrawals:");
        testWithdrawal(accounts.get(0), 400.0); // Savings: would go below 0
        testWithdrawal(accounts.get(1), 1200.0); // Credit: would go below -1000
        testWithdrawal(accounts.get(2), 200.0); // Savings: would go below 0

        System.out.println("\nFinal account states:");
        for (Account account : accounts) {
            System.out.println("- " + account);
        }
    }

    private static void testWithdrawal(Account account, double amount) {
        System.out.println("Attempting to withdraw $" + amount + " from " + account.getNumber());
        boolean success = account.withdraw(amount);
        if (success) {
            System.out.println("  ✓ Success! New balance: $" + account.getBalance());
        } else {
            System.out.println("  ✗ Failed! Current balance: $" + account.getBalance());
        }
    }
}
