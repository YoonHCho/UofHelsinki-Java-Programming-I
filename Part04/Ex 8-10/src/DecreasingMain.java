public class DecreasingMain {
    public static void main(String[] args) {
        DecreasingCounter counter1 = new DecreasingCounter(10);
        DecreasingCounter counter2 = new DecreasingCounter(2);
        DecreasingCounter counter3 = new DecreasingCounter(100);

        counter1.printValue();
        counter1.decrement();
        counter1.printValue();
        counter1.decrement();
        counter1.printValue();

        System.out.println("=====");

        counter2.printValue();
        counter2.decrement();
        counter2.printValue();
        counter2.decrement();
        counter2.printValue();
        counter2.decrement();
        counter2.printValue();

        System.out.println("=====");

        counter3.printValue();
        counter3.reset();
        counter3.printValue();
        counter3.decrement();
        counter3.printValue();

    }
}
