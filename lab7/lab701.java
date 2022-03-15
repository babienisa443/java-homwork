package lab7;

import java.util.Scanner;

public class lab701 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Checking Account");
        System.out.print("Overdraft Limit :");
        double limit = in.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setLimit(limit);
        checkingAccount.setBalance(5000);
        System.out.printf("Balance is %.2f\n", checkingAccount.getBalance());
        System.out.print("Withdraw: ");
        double amount = in.nextDouble();
        checkingAccount.withdraw(amount);
        System.out.printf("Balance is %.2f\n", checkingAccount.getBalance());
        System.out.println("This account was created at " + checkingAccount.getDateCreate());
        in.close();
    }
}