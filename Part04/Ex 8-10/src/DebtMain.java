public class DebtMain {
    public static void main(String[] args) {
        Debt mortgage = new Debt(120000.0, 1.01);

        mortgage.printBalance();
        mortgage.waitOneYear();
        mortgage.printBalance();

        int year = 0;

        while (year < 20) {
            mortgage.waitOneYear();
            year++;
        }

        mortgage.printBalance();

    }
}
