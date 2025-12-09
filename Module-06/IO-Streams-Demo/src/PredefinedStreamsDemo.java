public class PredefinedStreamsDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a character: ");

        int ch = System.in.read();

        System.out.println("You entered: " + (char)ch);
        System.err.println("This is an error message.");
    }
}
