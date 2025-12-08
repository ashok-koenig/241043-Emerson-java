public class ObjectMethodsDemo {
    int num;
    String name;

    public ObjectMethodsDemo(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ObjectMethodsDemo{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    static void main() {
        ObjectMethodsDemo obj = new ObjectMethodsDemo(10, "John");
        System.out.println("hashCode() "+ obj.hashCode());
        obj.name="John Smith";
        System.out.println("toString() "+ obj.toString() );
        System.out.println("Class: "+ obj.getClass());
    }
}
