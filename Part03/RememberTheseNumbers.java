import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) break;

            numbers.add(num);
        }

        // for (int i = 0; i < numbers.size(); i++) {
        //     System.out.println(numbers.get(i));
        // }

        // using enhanced for loop
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
