public class Greatest {
    public static void main(String[] args) {
        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }

    public static int greatest(int num1,  int num2, int num3) {
        int highest = num1;
        if (num2 > highest) {
            highest = num2;
        }
        if (num3 > highest) {
            highest = num3;
        }
        return highest;
    }
}
