package lab7;

import java.util.*;

public class account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreate;

    // construck
    account() {
        this(0, 0);
    }

    account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreate = new Date();
    }

    public int getId() {

        return this.id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public double getBalance() {

        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreate() {
        return dateCreate.toString();
    }

    public double getMonthlyInterestRate() {

        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {

        return this.balance * this.getMonthlyInterestRate() / 100;
    }

    public void withdraw(double withdraw) {
        if (withdraw > 0 && withdraw <= balance)
            this.balance -= withdraw;

    }

    public void deposit(double deposit) {
        if (deposit > 0)
            this.balance += deposit;

    }

    public String toString() {
        return "\nAccount ID: " + id + "\nDate created: " + getDateCreate()
                + "\nBalance: $" + String.format("%.2f", balance) +
                "\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
    }

}
