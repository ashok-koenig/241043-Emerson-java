import model.Student;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        try {
            Student s = new Student(101, "Ashok");

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("src/resources/student.ser"));

            oos.writeObject(s);
            oos.close();

            System.out.println("Object serialized.");
        }
        catch (IOException e) { System.out.println(e); }
    }
}
