//Explain Multiple Exception by using single try block (VVI)
package mypackage;

public class Multiple_Exceptions {

    public static void main(String[] args) {
        try {
            // ArithmeticException ----.1
            int div = 10 / 0;
            
            // ArrayIndexOutOfBoundsException ----.2
            int numbers[] = {1, 2, 3, 4, 9};
            System.out.println("My numbers:" + numbers[10]);
            
            // StringIndexOutOfBoundsException ----.3
            String name = "Raghav";
            System.out.println("My name:" + name.charAt(15));
            
            // NullPointerException ----.4
            String a = null;
            System.out.println("My name:" + a.length());
            
        } catch (ArithmeticException e) {  // Fixed typo in exception name
            System.out.println("My First " + e);
        } catch (ArrayIndexOutOfBoundsException e) { // Fixed typo in exception name
            System.out.println("My First " + e);
        } catch (StringIndexOutOfBoundsException e) { // Fixed typo in exception name
            System.out.println("My First " + e);
        } catch (NullPointerException e) {
            System.out.println("My First " + e);
        } finally {
            System.out.println("MY Four Errors Solving....");
        }
    }
}
