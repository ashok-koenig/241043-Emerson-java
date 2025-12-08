class MyClass{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize() executed before object deletion");
    }
}
public class GCFinalizeDemo {
    static void main() {
        MyClass obj = new MyClass();
        obj = null;
        System.gc();
    }
}
