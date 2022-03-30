public class lab702 { 
    public static void main(String[] args) {
        Account1 newAccount = new Account1("George", 1122, 1000);
        newAccount.setAnnualInterestRate(1.65);
        newAccount.deposit(30);
        newAccount.deposit(40);
        newAccount.deposit(50);
        newAccount.withdraw(5);
        newAccount.withdraw(4); 
        newAccount.withdraw(2);
        System.out.println("Name: " + newAccount.getName());
        System.out.println("Account ID: " + newAccount.getId());
        System.out.println("Annual Interest Rate: " + newAccount.getAnnualInterestRate());
        System.out.println("Balance: " + newAccount.getBalance());
        System.out.println("Date\t\t\t\tType\tAmount\tBalance");
        for (Transaction i : newAccount.getTransactions()) {
            i.printlnTransaction();
        }
    }
}
