public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(3, 6);
        divisibleByThreeInRange(2, 10);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int num = beginning;

        while (num <= end) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
