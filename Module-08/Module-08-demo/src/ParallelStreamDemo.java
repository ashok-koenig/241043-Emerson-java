import java.util.ArrayList;

public class ParallelStreamDemo {
    static void main() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        nums.parallelStream() // Source as parallel stream
                .map( (n) -> {
                    System.out.println("Thread: "+ Thread.currentThread().getName());
                    return n*10;
                    })
                .forEach((n -> System.out.println(n)));
    }
}
