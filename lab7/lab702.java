package lab7;

public class lab702 {
    public static void main(String[] args) {
        NewAccount Account = new NewAccount("George", 1122, 1000);
        Account.setAnnualInterestRate(1.65);
        Account.deposit(30);
        Account.deposit(40);
        Account.deposit(50);
        Account.withdraw(5);
        Account.withdraw(4);
        Account.withdraw(2);
        System.out.println("Name: " + Account.getName());
        System.out.println("Account ID: " + Account.getId());
        System.out.println("Annual Interest Rate: " + Account.getAnnualInterestRate());
        System.out.println("Balance: " + Account.getBalance());
        System.out.println("Date\t\t\t\tType\tAmount\tBalance");
        for (Transaction i : Account.getTransactions()) {
            i.printlnTransaction();
        }
    }
}
