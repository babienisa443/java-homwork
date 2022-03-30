
import java.util.Scanner;

public class lab701 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Checking Account");
        System.out.print("Overdraft limit: ");
        double limit = in.nextDouble();
        if (limit < 0)
            System.out.println("Error::LIMIT CANNOT LESS THAN 0");
        else {
            CheckingAccount checkingAccount = new CheckingAccount();
            checkingAccount.setLimit(limit);
            checkingAccount.setBalance(5000);
            System.out.println("Balance is " + checkingAccount.getBalance());
            System.out.print("Withdraw: ");
            double amount = in.nextDouble();
            checkingAccount.withdraw(amount);
            System.out.println("Balance is " + checkingAccount.getBalance());
            System.out.println("This account was created at " + checkingAccount.getDateCreated());
        }
        in.close();
    }
} 