public class AdvancedAstrology {
    public static void main(String[] args) {
        printTriangle(4);
        System.out.println();
        christmasTree(10);
    }

    public static void printSpaces(int number) {
        int counter = 0;
        while (counter < number) {
            System.out.print(" ");
            counter++;
        }
    }

    public static void printStars(int number) {
        int counter = 0;
        while (counter < number) {
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        int counter = 0;
        int spaces = size - 1;
        int stars = 1;

        while (counter < size) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars++;
            counter++;
        }
    }

    public static void christmasTree(int height) {
        int counter = 0;
        int spaces = height - 1;
        int stars = 1;

        while (counter < height) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars += 2;
            counter++;
        }
        printTrunk(height);
    }

    public static void printTrunk(int trunk) {
        if (trunk < 3) return;
        int trunkSpaces = trunk - 2;
        int counter = 0;
        while (counter < 2) {
            printSpaces(trunkSpaces);
            printStars(3);
            counter++;
        }
    }
}
