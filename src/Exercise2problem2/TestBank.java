package Exercise2problem2;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        // Add accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Create transactions
        DepositTransaction depositTransaction = new DepositTransaction(savingsAccount, 1000);
        WithdrawalTransaction withdrawalTransaction = new WithdrawalTransaction(currentAccount, 500);

        // Add transactions to the bank
        bank.addTransaction(depositTransaction);
        bank.addTransaction(withdrawalTransaction);

        // Execute transactions
        bank.executeTransactions();

        // Display balances
        bank.displayBalances();
    }
}

