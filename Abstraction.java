package mypackage;

//abstract class Animal{  //Abstract class parent
//	
//abstract void sound();  //abstract method doest have body
//	
//}
//
//class Dog extends Animal{   //child class
//	@Override
//	void sound() {
//		System.out.println("Bow Bow..!!");
//		
//	}
//}
//public class Abstraction {
//	public static void main(String[] args) {
//		Animal d = new Dog();
//		d.sound();
//	}
//
//}


package mypackage;

public abstract class Animal {  // Removed extra () and added public
    public abstract void sound();  // Added public to abstract method
}

class Dog extends Animal {   // child class
    @Override
    void sound() {    // Added public to match the abstract method
        System.out.println("Bow Bow..!!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
    }
}