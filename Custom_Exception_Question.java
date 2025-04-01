package mypackage;

//3.custom exception and eligibility check for voting by using constructor
class AdityaException extends Exception {
  public AdityaException(String msg) { // Constructor
      super(msg);
  }
}

public class Custom_Exception {
  public static void main(String[] args) {
      try {
          checkEligibility(17); // Change number to check eligibility
      } catch (AdityaException e) {
          System.out.println("MY Custom Error: " + e);
      } finally {
          System.out.println("MY Custom Error is Created");
      }
  }

  public static void checkEligibility(int age) throws AdityaException {
      if (age < 18) {
          throw new AdityaException("Age is below 18, not eligible to vote.");
      } else {
          System.out.println("Eligible to vote.");
      }
  }
}
