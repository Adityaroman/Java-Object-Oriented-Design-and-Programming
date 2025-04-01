package mypackage;

class AdityaException extends Exception {
    public AdityaException(String msg) { // Constructor
        super(msg);
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        try {
            throw new AdityaException("MY message");
        } catch (AdityaException e) {
            System.out.println("MY Custom Error: " + e);
        } finally {
            System.out.println("MY Custom Error is Created");
        }
    }
}

