import java.util.function.Function;

public class FunctionDemo {
    static void main() {
        Function<Integer, Integer> square = (num) -> num * num;
        System.out.println("Square: "+ square.apply(5));

        Function<Integer, Double> area = (radius) -> Math.PI * radius * radius;
        System.out.println("Area: " + area.apply(5));
    }
}
