package GcashApp;

import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private String recipient;
    private LocalDateTime date;

    public Transaction(String type, double amount, String recipient) {
        this.type = type;
        this.amount = amount;
        this.recipient = recipient;
        this.date = LocalDateTime.now();
    }

    public String toString(){
        return "[" + date + "] " + type + " P" + amount + (recipient != null? " to" + recipient : "");
    }
}
