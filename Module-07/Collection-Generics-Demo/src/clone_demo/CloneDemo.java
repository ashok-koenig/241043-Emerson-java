package clone_demo;

class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(1, "Ashok");
        Student s2 = s1.clone();
//        Student s2 = s1;
        s1.name = "JOhn";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
