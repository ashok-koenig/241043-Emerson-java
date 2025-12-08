class A1 {
    void methodA() {
        System.out.println("Inside A");
    }
}

class B1 extends A1 {
    void methodB() {
        System.out.println("Inside B");
    }
}

class C1 extends B1 {
    void methodC() {
        System.out.println("Inside C");
    }
}

public class MultilevelDemo {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
