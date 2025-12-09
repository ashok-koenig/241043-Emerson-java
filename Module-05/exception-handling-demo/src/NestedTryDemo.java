public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            int a = 5 / 1;

            try {
                int[] arr = new int[2];
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }

            int x = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Divide by zero");
        }
    }
}
