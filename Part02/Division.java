public class Division {
    public static void main(String[] args) {
        division(3, 5);
    }

    public static void division(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Invalid denominator, can't be 0");
            return;
        }
        System.out.println((double) numerator / denominator);
    }
}
