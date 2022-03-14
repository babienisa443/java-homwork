import java.util.*;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreate;

    // construck
    Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreate = new Date();

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

    public Date getDateCreate() {

        return this.dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public double getMonthlyInterestRate() {

        return this.annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {

        return this.balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double withdraw) {
        if (withdraw > 0 && withdraw <= balance)
            this.balance -= withdraw;

    }

    public void deposit(double deposit) {
        if (deposit > 0)
            this.balance += deposit;

    }

}
