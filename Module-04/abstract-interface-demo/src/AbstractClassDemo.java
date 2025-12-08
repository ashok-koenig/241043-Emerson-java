abstract class Animal{
    abstract void sound(); // abstract method
    void sleep(){ // Concrete method
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Dog barks...");
    }
}

public class AbstractClassDemo {
    static void main() {
        Animal animal = new Dog();
        animal.sound();
        animal.sleep();
    }
}
