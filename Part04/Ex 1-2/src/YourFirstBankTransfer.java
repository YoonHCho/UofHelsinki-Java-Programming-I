public class YourFirstBankTransfer {
    public static void main(String[] args) {
        Account matthews = new Account("Matthew's account", 1000.0);
        Account myAcct = new Account("My account", 0);

        matthews.withdrawal(100.0);
        myAcct.deposit(100.0);

        System.out.println(matthews);
        System.out.println(myAcct);
    }
}
