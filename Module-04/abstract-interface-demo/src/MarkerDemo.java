interface MyMarker {}

//class Demo implements MyMarker{
class Demo {
    void show(){
        System.out.println("Demo class implementing mark interface");
    }
}
public class MarkerDemo {
    static void main() {
        Demo obj = new Demo();

        if(obj instanceof MyMarker){
            obj.show();
        } else {
            System.out.println("Object is not marked");
        }
    }
}
