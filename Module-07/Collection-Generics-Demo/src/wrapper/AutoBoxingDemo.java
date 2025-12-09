package wrapper;

public class AutoBoxingDemo {
    static void main() {
        int num1 = 100;
        int num2 = 100;

        Integer obj = 200;  // Auto boxing

        System.out.println("Integer: "+ obj);

        int num = obj; // auto unboxing

        System.out.println("int: "+ num);
    }
}
