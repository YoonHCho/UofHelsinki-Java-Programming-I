import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isBlank()) {
                break;
            }

            String[] array = input.split(" ");
            for (String el : array) {
                System.out.println(el);
            }
        }
    }
}
