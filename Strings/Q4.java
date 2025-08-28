package Level1;

public class Q4 {
    // Method to generate exception
    static void generateException() {
        String text = null;
        System.out.println(text.length());  // NPE
    }

    // Method to handle exception
    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        }
    }

    public static void main(String[] args) {
        // Uncomment one by one
        // generateException();
        handleException();
    }
}
