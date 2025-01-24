import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isBlank()) {
                break;
            }

            String[] array = input.split(" ");

            for (String el : array) {
                if (el.contains("av")) {
                    System.out.println(el);
                }
            }
        }
    }
}
