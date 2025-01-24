import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        double avgYear = 0.0;
        int counter = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isBlank()) {
                break;
            }

            String[] array = input.split(",");
            avgYear += Double.parseDouble(array[1]);
            if (array[0].length() > longestName.length()) {
                longestName = array[0];
            }
            counter++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (avgYear / counter));
    }
}
