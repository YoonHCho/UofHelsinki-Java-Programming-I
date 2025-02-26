public class Agent {
    private String first;
    private String last;

    public Agent(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String toString() {
        return "My name is, " + this.first + " " + this.last;
    }
}
