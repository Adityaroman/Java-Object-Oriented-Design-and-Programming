//map is of two types(for exam)  - Map: HashMap, LinkedHashMap, TreeMap

//map is unordered not maintaining any order
//Operations we can use in map
//1.put()
//2.remove()
//3.for loop
package mypackage;
import java.util.Map;
import java.util.HashMap;

public class MAps {

    public static void main(String[] args) {
        Map<String, Integer> colors = new HashMap<>();
        System.out.println("My Empty Map: " + colors);
        //two parameters we can put in map key and value

        colors.put("Red", 1);
        colors.put("Blue", 2);
        colors.put("Green", 3);
        colors.put("Yellow", 4);
        colors.put("Purple", 5);

        System.out.println("My empty map after adding: " + colors);
        colors.remove("Red");
        System.out.println("My empty map after removing: " + colors);
        //for printing horizontally
        for (Map.Entry<String,Integer>entry : colors.entrySet()) {
            System.out.println("Keys:=>"+entry.getKey()+","+"Values:=>"+entry.getValue());
        }
    }
}


//| Feature             | List                         | Set                                | Map                                  |
|---------------------|------------------------------|-------------------------------------|---------------------------------------|
| Type of Collection  | Ordered collection            | Unordered (no duplicates)          | Key-value pair collection             |
| Allows Duplicates   | Yes                          | No                                 | Keys: No, Values: Yes                 |
| Element Access      | By index                     | No direct access                   | By key                                |
| Ordering            | Maintains order              | HashSet: No order                  | HashMap: No order                     |
| Common Use          | Storing ordered data         | Ensuring unique items              | Mapping keys to values                |
| Important Types     | ArrayList, LinkedList        | HashSet, TreeSet                   | HashMap, TreeMap                      |
s