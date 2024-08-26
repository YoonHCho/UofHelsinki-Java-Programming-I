import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to? ");
        int end = scanner.nextInt();
        System.out.println("Where from?");
        int start = scanner.nextInt();
        while (start <= end) {
            System.out.println(start);
            start++;
        }
    }
}
