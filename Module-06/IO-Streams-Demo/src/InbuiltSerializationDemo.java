import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class InbuiltSerializationDemo {
    static void main() {
        try {
            String str = "Working with in built serialization";
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("src/resources/msg.ser"));
            oos.writeObject(str);
            oos.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
