import java.util.function.Supplier;

public class SupplierDemo {
    static void main() {
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: "+ randomSupplier.get());
    }
}
