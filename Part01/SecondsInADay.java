import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        System.out.println("How many days would you like to convert to seconds?");
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        // 24 hours a day * 60 minutes in an hour * 60 seconds in a minute
        int daysInSeconds = days * 24 * 60 * 60;
        System.out.println(daysInSeconds);
    }
}
