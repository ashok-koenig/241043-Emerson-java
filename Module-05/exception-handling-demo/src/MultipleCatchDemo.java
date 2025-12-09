public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);  // ArrayIndexOutOfBounds
            int result = 10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General exception: " + e);
        }
    }
}
