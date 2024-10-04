import java.util.ArrayList;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        // Write code, when executed, it always produces the error "IndexOutOfBounds"
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.get(0));
    }
}
