import java.io.*;

public class CheckedUncheckedDemo {
    public static void main(String[] args) {

        // Unchecked
        try {
            int n = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception: " + e);
        }

        // Checked
        try {
            FileReader fr = new FileReader("abc.txt"); // checked
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception: " + e.getMessage());
        }
    }
}

