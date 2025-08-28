import java.util.Date;

public class Transaction {
    private String type;
    private double amount;
    private Date date;
    private String details;

    public Transaction(String type, double amount, String details) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
        this.details = details;
    }

    public String toString() {
        return date + " | " + type + " | " + amount + " | " + details;
    }
}