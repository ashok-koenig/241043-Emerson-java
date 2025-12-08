class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}
public class InheritanceDemo {
    static void main() {
        Car car = new Car();
        car.start();
        car.drive();
    }
}
