import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int counter = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += num;
            counter++;
        }
        if (counter > 0) {
            average = (double) sum / counter;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
