import java.util.function.Consumer;

public class ConsumerDemo {
    static void main() {
        Consumer<String> printer = (msg) -> System.out.println("Message: "+ msg);
        printer.accept("My message");
    }
}
