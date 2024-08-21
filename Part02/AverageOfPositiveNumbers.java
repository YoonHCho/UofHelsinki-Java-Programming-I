import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        double average = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                sum += num;
                counter++;
            }
        }
        if (counter > 0) {
            average = (double) sum / counter;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
