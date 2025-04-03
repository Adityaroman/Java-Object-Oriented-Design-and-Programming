//VVI how to create list in java Explain list defination add 5 elements all
// this is how empty list created in java then we can add elements in java
package mypackage;
import java.util.List;
import java.util.ArrayList;

public class collections {
    public static void main(String[]args) {
    	List<Integer> numbers = new ArrayList<>();  //Syntax for creating list in java
    	System.out.println("M number List Before Adding Elements:"+numbers);
    	numbers.add(100);
    	numbers.add(200);
    	numbers.add(300);
    	numbers.add(400);
    	numbers.add(500);
    	System.out.println("M number List After Adding Elements:"+numbers);
    	numbers.remove(2);
    	System.out.println("M number List After remove Added Element:"+numbers);
    }
}


//Add 10 fruits simillarly by creating string data types

package mypackage;
import java.util.List;
import java.util.ArrayList;

public class collections {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();  // Creating a list of fruits

        System.out.println("Fruit List Before Adding Elements: " + fruits);
        
        // Adding 10 fruits to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        fruits.add("Watermelon");
        fruits.add("Peach");
        fruits.add("Cherry");

        System.out.println("Fruit List After Adding Elements: " + fruits);
        
        // Removing the 3rd fruit (index 2)
        fruits.remove(2);
        System.out.println("Fruit List After Removing a Fruit: " + fruits);
    }
}

//To print in horizontal way
package mypackage;
import java.util.List;
import java.util.ArrayList;

public class collections {
    public static void main(String[]args) {
    	List<Integer> numbers = new ArrayList<>();  //Syntax for creating list in java
    	System.out.println("M number List Before Adding Elements:"+numbers);
    	numbers.add(100);
    	numbers.add(200);
    	numbers.add(300);
    	numbers.add(400);
    	numbers.add(500);
    	System.out.println("M number List After Adding Elements:"+numbers);
    	numbers.remove(2);
    	System.out.println("M number List After remove Added Element:"+numbers);
    	for(int num : numbers) {
            System.out.println("My numbers List using Iteration:"+num);
    	}
    }
