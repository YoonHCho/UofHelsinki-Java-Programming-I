import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String[] args) {
        System.out.println("Write a message: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        System.out.println(userInput);
        System.out.println(userInput);
    }
}
