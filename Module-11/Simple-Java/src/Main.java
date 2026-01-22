class Main{
    int num;
    String name;


    Main(int num, String name) {
        this.num = num;
        this.name = name;
    }

    void display(){
        System.out.println("Num:"+ num);
        System.out.println("Name: "+ name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void main() {
        Main obj = new Main(10, "John");
        System.out.println("Welcome to Java");
//        obj.name ="John";
        obj.display();

        Main obj1 = new Main(12, "Smith");
//        obj1.name = "Smith";
        obj1.display();

        Student.currentCount();
        Student s1 = new Student(101, 98);
//        s1.mark // not possible, its private
        System.out.println("Mark Using Getter: "+ s1.getMark());
        s1.setId(102);
        s1.display();
        Student.currentCount();
        Student s2 = new Student();
        s1.display();
        Student.currentCount();
    }
}
