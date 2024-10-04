import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isBlank()) {
                break;
            }
            list.add(userInput);
        }

        System.out.println(list.get(2));
    }
}
