import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/resources/textin.txt");
            FileWriter writer = new FileWriter("src/resources/textout.txt");

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            reader.close();
            writer.close();
            System.out.println("Character stream copy done.");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
