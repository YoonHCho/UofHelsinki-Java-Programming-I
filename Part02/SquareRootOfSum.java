import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        // Per instruction, program does not need to word with negative value
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println((int) Math.sqrt(first + second));
    }
}
