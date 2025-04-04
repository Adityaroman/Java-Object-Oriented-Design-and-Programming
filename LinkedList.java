package mypackage;
//Syntax for ceating LinkedList
//import java.util.List;
//import java.util.LinkedList;
//
//public class LinkedList {
//
//	public static void main(String[] args) {
//		List<String> heros = new LinkedList<>();
//		System.out.println("MY Linked LIst:",+heros);
//
//	}
//
//}

//Adding elemens in linked list(10 Marks Quetion)

correct it out just as it is 
import java.util.List;
import java.util.LinkedList;

public class LinkedList {

	public static void main(String[] args) {
		List<String> heros = new LinkedList<>();
		System.out.println("MY Linked LIst:",+heros);
		heros.add("NTR");
		heros.add("ANR");
		heros.add("NBK");
		heros.add("NKR");
		heros.add("Ram charan");
		
		System.ou.println("MY Linked List After adding:"+heros);
		
		heros.remove(4);
		System.ou.println("MY Linked List After removing:"+heros);
		
		String temp = heros.get(0);
		System.out.println("My List After adding:"+temp);
		
		for(String hero : heros) {
			System.out.println("My Linked List using Iterator:"+heros);
		}
		

	}

}

//if u want to add first  or last 
import java.util.List;
import java.util.LinkedList;

public class LinkedList {

	public static void main(String[] args) {
		List<String> heros = new LinkedList<>();
		System.out.println("MY Linked LIst:",+heros);
		heros.add("NTR");
		heros.add("ANR");
		heros.add("NBK");
		heros.add("NKR");
		heros.add("Ram charan");
		
		System.ou.println("MY Linked List After adding:"+heros);
		
		heros.remove(4);
		System.ou.println("MY Linked List After removing:"+heros);
		
		String temp = heros.get(0);
		System.out.println("My List After adding:"+temp);
		
		for(String hero : heros) {
			System.out.println("My Linked List using Iterator:"+heros);
		}
		heros.add("Allu arjun")
		System.out.println("My Linked List after adding:"+heros);
		
		((LinkedList<String>)heros).addFirst("Raghav");  //differ between list and linked list
		((LinkedList<String>)heros).addLast("Abhi");
		System.out.println("My Linked List After adding:"+heros);

	}

}


//practice question
create appliances linked list and perform
add()
remove()
get()
for()
addfirst()
addlast()
