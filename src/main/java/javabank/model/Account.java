package javabank.model;

public class  Account {
    private int accId;
    public double balance;
    public String user;
    public String history;

    public Account(int accId, double balance, String user, String history) {
        this.accId = accId;
        this.balance = balance;
        this.user = user;
        this.history = history;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return ("Uzytkownik: " + user + " Stan konta: " + balance);
    }
}
