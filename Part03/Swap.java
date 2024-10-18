import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        printArray(numbers);

        System.out.println("Give two indices to swap:");
        System.out.print("First: ");
        int first = scanner.nextInt();
        System.out.print("Second: ");
        int second = scanner.nextInt();

        int temp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temp;

        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
