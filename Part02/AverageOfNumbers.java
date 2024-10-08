import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        double average = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            counter++;
        }
        if (counter > 0) {
            average = (double) sum / counter;
            System.out.println("Average of the numbers: " + average);
        } else {
            System.out.println("You need to input at least one positive number");
        }
    }
}
