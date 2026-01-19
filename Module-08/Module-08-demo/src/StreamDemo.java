import java.util.ArrayList;

// Sequential Stream
public class StreamDemo {
    static void main() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        nums.stream() // Source
                .map((n) -> n * 10) // Intermediate Operation
                .forEach((n)-> System.out.println(n)); // Terminal Operation
    }
}
