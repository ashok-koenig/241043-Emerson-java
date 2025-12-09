class Outer{

    class Inner {
        void display(){
            System.out.println("Display method inside not static inner class");
        }
    }
}
public class InnerClassDemo {

    static void main() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();  // Creating object for inner class with the help of outer class object
        inner.display();
    }
}
