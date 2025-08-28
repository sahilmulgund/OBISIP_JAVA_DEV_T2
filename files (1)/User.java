import java.util.*;

public class User {
    private String userId;
    private String pin;
    private double balance;
    private List<Transaction> transactions;

    public User(String userId, String pin, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getUserId() { return userId; }
    public String getPin() { return pin; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public List<Transaction> getTransactions() { return transactions; }

    public void addTransaction(Transaction tx) {
        transactions.add(tx);
    }
}