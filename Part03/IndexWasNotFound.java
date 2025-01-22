import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {6, 2, 8, 1, 3, 0, 9, 7};

        System.out.print("Search for? ");
        int userInput = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {
            if (array[i] == userInput) {
                System.out.println(userInput + " is at index " + i + ".");
                return;
            }
        }

        System.out.println(userInput + " was not found.");
    }
}
