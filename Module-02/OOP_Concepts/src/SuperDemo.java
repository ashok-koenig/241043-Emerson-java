class A {
    int x = 10;

    A() {
        System.out.println("A's constructor");
    }

    void display() {
        System.out.println("Display from A");
    }
}

class B extends A {
    int x = 20;

    B() {
        super();  // calls A's constructor
        System.out.println("B's constructor");
    }
// Overriding
    void display() {
        System.out.println("Super x = " + super.x); // accesses A's variable
        System.out.println("This x = " + this.x);
        super.display(); // calls superclass method
    }
    // Overloading
    void display(String message){
        System.out.println("Message: "+ message);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
