public class AgentMain {
    public static void main(String[] args) {
        Agent bond = new Agent("James" , "Bond");
        bond.toString(); // prints nothing, because the toString method
        // created returns a string
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }
}
