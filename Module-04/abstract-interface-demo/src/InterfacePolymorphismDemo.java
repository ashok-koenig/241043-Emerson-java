interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with button.");
    }
}

public class InterfacePolymorphismDemo {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();   // interface reference → Car object
        v.start();

        v = new Bike();  // interface reference → Bike object
        v.start();
    }
}
