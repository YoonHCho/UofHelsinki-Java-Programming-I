import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            }
            numList.add(userInput);
        }

        System.out.println(numList.get(1) + numList.get(2));
    }
}
