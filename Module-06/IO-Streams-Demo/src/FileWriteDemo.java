import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src/resources/textout.txt");
            fw.write("Hello from Java FileWriter!");
            fw.close();
            System.out.println("File written successfully.");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
