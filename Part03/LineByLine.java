import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            return;
        }

        String[] array = input.split(" ");

        for (String el : array) {
            System.out.println(el);
        }
    }
}
