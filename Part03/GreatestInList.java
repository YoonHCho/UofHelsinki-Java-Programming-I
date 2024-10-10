import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int greatest = Integer.MIN_VALUE;

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) break;

            numbers.add(input);
        }

        for (int num : numbers) {
            if (num > greatest) {
                greatest = num;
            }
        }

        System.out.println("The greatest number: " + greatest);
    }
}
