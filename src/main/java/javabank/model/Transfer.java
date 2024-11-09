package javabank.model;

import java.util.Date;

public class Transfer {
    private Date date;
    private int amount;
    private int source;
    private int target;

    public Transfer(Date date, int amount, int source, int target) {
        this.date = date;
        this.amount = amount;
        this.source = source;
        this.target = target;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }
}
