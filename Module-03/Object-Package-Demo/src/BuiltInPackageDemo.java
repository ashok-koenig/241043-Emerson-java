import java.util.Date;
import java.util.Scanner;

public class BuiltInPackageDemo {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);

        Date today = new Date();
        System.out.println("Today: "+ today);
    }

}
