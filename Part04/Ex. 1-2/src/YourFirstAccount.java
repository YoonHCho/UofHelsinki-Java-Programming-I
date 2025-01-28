public class YourFirstAccount {
    public static void main(String[] args) {
        Account newAcct = new Account("Me", 100.0);
        newAcct.deposit(20.0);
        System.out.println(newAcct);
    }
}
