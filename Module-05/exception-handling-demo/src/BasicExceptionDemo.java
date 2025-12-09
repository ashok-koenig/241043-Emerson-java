import java.util.Scanner;

public class BasicExceptionDemo {
    static int divide(int num1, int num2) throws ArithmeticException{
        if(num2 ==0 ){
            throw new ArithmeticException("num 2 should not be zero");
        }
        return num1 / num2;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        try {
            int result = divide(num1,num2);
            System.out.println("Result: "+ result);
        } catch (Exception e){
            System.out.println("Message: " + e.getMessage() + " Type: "+ e.getClass());
        } finally {
            System.out.println("This always executes");
        }
    }
}
