import java.util.Scanner;

public class lab501 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account account = new Account();
        account.setBalance(20000);
        account.setAnnualInterestRate(4.5);

        System.out.print("ID : ");
        int n = in.nextInt();
        if (n >= 1000 && n < 9999) {

            System.out.print("Choose your service [1]withdraw [2]deposit :");
            int i = in.nextInt();
            if (i >= 1 && i <= 2) {
                if (i == 1) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = in.nextDouble();
                    if (amount > 0 && amount <= account.getBalance()) {
                        account.withdraw(amount);

                    } else
                        System.out.print("Error");

                }
                if (i == 2) {
                    System.out.print("Enter amount deposit: ");
                    double amount = in.nextDouble();
                    if (amount > 0) {
                        account.deposit(amount);
                    }
                }

            } else
                System.out.println("error");

            System.out.println("Balance: " + account.getBalance());
            System.out.println("Monthly Interest: " + account.getMonthlyInterest());
            System.out.println("Date when this account was created: " + account.getDateCreate());

        } else
            System.out.println("Error");
        in.close();
    }

}
