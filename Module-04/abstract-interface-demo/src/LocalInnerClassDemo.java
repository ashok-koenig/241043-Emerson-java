class Test{
    void show(){
        class LocalInner {
            void display(){
                System.out.println("Inside local inner class method");
            }
        }

        LocalInner obj = new LocalInner();
        obj.display();
    }
}
public class LocalInnerClassDemo {
    static void main() {
        Test test = new Test();
        test.show();
    }
}
