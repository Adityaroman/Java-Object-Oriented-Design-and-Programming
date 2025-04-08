package mypackage;

//Sets

import java.util.Set;
import java.util.HashSet;



public class SetS {

	public static void main(String[] args) {
        Set<String> gods = new HashSet<>(); 
        System.out.println("My Empty Set;"+gods);
        gods.add("Ram");
        gods.add("Vishnu");
        gods.add("Laxman");
        gods.add("Hanuman");
        gods.add("Durga");
//        gods.add("Durga");  duplicate not allowed in sets
        gods.add(null);
//      gods.add(null);  null is only allowed one time 
        
        System.out.println("My Empty Set After Adding:"+gods); //set not maintaning any order it will print in randomm order
//        gods.remove("Ram");
//        System.out.println("My Empty Set After Removing:"+gods);
//        
        for(String new1: gods) {
        	System.out.println("My Empty Set using for loop:"+new1);
        }
        
	}

}




















//TreeSet
import java.util.Set;
import java.util.TreeSet;

public class SetS1 {

    public static void main(String[] args) {
        Set<String> chocolates = new TreeSet<>(); 
        System.out.println("My Empty TreeSet: " + chocolates);
        
        chocolates.add("Dairy Milk");
        chocolates.add("5 Star");
        chocolates.add("KitKat");
        chocolates.add("Perk");
        chocolates.add("Munch");
//        chocolates.add("Munch"); // duplicate not allowed in sets
//        chocolates.add(null);    // TreeSet does not allow null (will throw NullPointerException)

        System.out.println("My TreeSet After Adding: " + chocolates); // TreeSet maintains sorted order
        
//        chocolates.remove("KitKat");
//        System.out.println("My TreeSet After Removing: " + chocolates);
        
        for(String choco : chocolates) {
            System.out.println("My TreeSet using for loop: " + choco);
        }
    }
}
