import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int smallest = Integer.MAX_VALUE;

        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) break;

            numbers.add(input);
            if (input < smallest) {
                smallest = input;
            }
        }

        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
