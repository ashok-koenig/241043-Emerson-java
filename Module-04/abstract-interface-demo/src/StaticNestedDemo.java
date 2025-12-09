class MyClass {
    static class Nested {
        void show(){
            System.out.println("Inside static nested class");
        }
    }
}
public class StaticNestedDemo {
    static void main() {
        MyClass.Nested obj = new MyClass.Nested();
        obj.show();
    }
}
