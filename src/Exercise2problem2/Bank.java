package Exercise2problem2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private List<Transaction> transactions;

    public Bank() {
        accounts = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void executeTransactions() {
        for (Transaction transaction : transactions) {
            transaction.execute();
        }
    }

    public void displayBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.getBalance());
        }
    }
}
