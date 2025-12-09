import java.io.*;

class Parent{
    Parent() throws IOException{
        throw new IOException();
    }
}

class Child extends Parent{
    Child() throws IOException{
//        super();
    }
}

public class CheckedRulesDemo {

    static void methodB() throws IOException {
        throw new IOException("IO Error");
    }

    static void methodA() throws IOException {
        methodB();
    }

    public static void main(String[] args) {
        try {
            methodA();
            Child obj = new Child();
        } catch (IOException e) {
            System.out.println("Handled checked exception: " + e.getMessage());
        }
    }
}
