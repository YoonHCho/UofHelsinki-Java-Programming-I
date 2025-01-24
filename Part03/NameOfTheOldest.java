import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = Integer.MIN_VALUE;
        String name = "N/A";
        while (true) {
            String input = scanner.nextLine();
            if (input.isBlank()) {
                break;
            }

            String[] array = input.split(",");
            int age = Integer.parseInt(array[1]);
            if (age > oldest) {
                name = array[0];
            }
        }

        System.out.println("Name of the oldest: " + name);
    }
}
