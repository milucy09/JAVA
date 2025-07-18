package GcashApp;

public class User {
    private String username;
    private String pin;
    private double balance;

    public User(String username, String pin){
        this.username = username;
        this.pin = pin;
        this.balance = 0.0;
    }

    public String getUsername() {return username; }
    public String getPin() {return pin; }
    public double getBalance() {return balance; }
        
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
