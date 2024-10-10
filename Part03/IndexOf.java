import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) break;

            numbers.add(input);
        }
        System.out.print("Search for? ");
        int search = scanner.nextInt();
        for (int i = 0; i < numbers.size(); i++) {
            if (search == numbers.get(i)) {
                System.out.println(search + " is at index " + i);
            }
        }
    }
}
