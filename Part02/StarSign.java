public class StarSign {
    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n--");
        printSquare(4);
        System.out.println("\n--");
        printRectangle(5, 6);
        System.out.println("\n--");
        printTriangle(4);
    }

    public static void printStars(int num) {
        int counter = 0;
        while (counter < num) {
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        int counter = 0;
        while (counter < size) {
            printStars(size);
            counter++;
        }
    }

    public static void printRectangle(int width, int height) {
        int counter = 0;
        while (counter < height) {
            printStars(width);
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }
}
