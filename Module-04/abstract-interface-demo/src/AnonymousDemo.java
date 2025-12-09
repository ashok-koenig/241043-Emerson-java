interface Greeting {
    void sayHello();
}
public class AnonymousDemo {
    static void main() {
        Greeting greet1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous inner class");
            }
        };

        greet1.sayHello();

        Greeting greet2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("another implementation of the sayHello()");
            }
        };

        greet2.sayHello();
    }
}
