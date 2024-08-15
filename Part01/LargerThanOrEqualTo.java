import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = sc.nextInt();
        System.out.println("Give the second number:");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (first < second) {
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
