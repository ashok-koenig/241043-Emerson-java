import java.io.*;

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/resources/textin.txt");
            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
