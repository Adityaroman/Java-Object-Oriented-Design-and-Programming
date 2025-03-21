```java
package mypackage;

// Final class cannot be inherited
final class FinalClass {
    // Final method cannot be overridden
    final public void finalMethod1() {
        System.out.println("I am final method1");
    }
}

// This will cause an error because final classes cannot be extended
// class Final1 extends FinalClass {
//     public void finalMethod2() {
//         System.out.println("I am final method2");
//     }
// }

public class FinalExample {
    public static void main(String[] args) {
        // Final variable cannot be reassigned
        final int a = 100;
        // a = 200; // This will cause an error
        
        System.out.println("a value: " + a);
        
        FinalClass f = new FinalClass();
        f.finalMethod1();
    }
}

// Final keyword restricts modification of classes, methods, and variables
```