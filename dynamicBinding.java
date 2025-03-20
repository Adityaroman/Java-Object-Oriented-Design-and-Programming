package mypackage;

// Dynamic or late Binding in polymorphism
class Animal {  // Parent class
    public void sound() { // Removed static, changed method to instance method
        System.out.println("Animal Sounds");
    }
}

class Dog extends Animal {  // Child class
    @Override
    public void sound() { // Removed static to allow dynamic binding
        System.out.println("Bow Bow..");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Animal d = new Dog(); // Dynamic binding (reference of parent, object of child)
        d.sound(); // Calls Dog's sound() method due to dynamic binding
    }
}
