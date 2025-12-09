import model.Student;

import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("src/resources/student.ser"));

            Student s = (Student) ois.readObject();
            ois.close();

            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
        }
        catch (Exception e) { System.out.println(e); }
    }
}
