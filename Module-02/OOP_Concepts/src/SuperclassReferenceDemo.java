class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show()");
    }
}

public class SuperclassReferenceDemo {
    public static void main(String[] args) {
        Parent p = new Child();    // Super class reference holding subclass object
        p.show();                  // Calls Child's version
    }
}
