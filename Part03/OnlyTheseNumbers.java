import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) break;

            numbers.add(num);
        }

        System.out.print("From where? ");
        int start = scanner.nextInt();
        System.out.print("To where? ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
