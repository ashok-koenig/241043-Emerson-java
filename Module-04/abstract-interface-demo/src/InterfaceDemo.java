interface Shape{
    void draw(); // Abstract method
    default void defaultMethod(){ // Concrete method
        System.out.println("Default method implementation in interface");
    }
}

class Circle implements  Shape{

    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }
}
public class InterfaceDemo {
    static void main() {
        Shape obj = new Circle();
        obj.draw();
        obj.defaultMethod();
    }
}
