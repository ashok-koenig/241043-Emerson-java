@FunctionalInterface
interface Greeter {
    void greet(String name);
//    void print();
}

// Regular way to provide implementation for interface
//class GreeterImpl implements Greeter{
//    public void greet() {
//        System.out.println("Hello");
//    }
//}

public class FunctionalInterfaceDemo {
    static void main() {
        // Creating object for the implementation class and call the method
//        GreeterImpl g = new GreeterImpl();
//        g.greet();

        Greeter g = (String name) -> System.out.println("Hello from Lambda! Name: "+ name);
        g.greet("John");

        Greeter g1 = (String name) -> System.out.println("Welcome "+name);
        g1.greet("Peter");
    }
}
