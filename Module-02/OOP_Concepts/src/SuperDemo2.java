class Person{
    private String name;
    private  int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce(){
        System.out.println("I'm "+ name + " and "+ age + "years old");
    }
}
class Student extends Person{
    private int grade;
    Student(String name, int age, int grade){
        super(name, age);
        this.grade = grade;
    }

    void introduce(){
        super.introduce();
        System.out.println("Grade: "+ grade);
    }
}
public class SuperDemo2 {
    static void main() {
        Student s1 = new Student("John", 17, 10);
        s1.introduce();
    }
}
