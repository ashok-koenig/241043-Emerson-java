import java.io.*;

public class ImageCopyDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/resources/input.jpg");
            FileOutputStream fos = new FileOutputStream("src/resources/output.jpg");

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            System.out.println("Image copied successfully.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

