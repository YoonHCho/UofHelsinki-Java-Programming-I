import java.util.Scanner;

// 4 Parts Exercise
public class StatisticsMain {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");

        int even = 0;
        int odd = 0;

        while (true) {
            int userInput = sc.nextInt();

            if (userInput == -1) break;
            statistics.addNumber(userInput);
            if (userInput % 2 == 0) {
                even += userInput;
            } else {
                odd += userInput;
            }
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
    }
}
