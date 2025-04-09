package mypackage;
import java.util.Map;
import java.util.HashMap;

public class MAps {

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        System.out.println("My Empty Map: " + employees);
        //two parameters we can put in map key and value

        employees.put("John", 101);
        employees.put("Alice", 102);
        employees.put("Bob", 103);
        employees.put("David", 104);
        employees.put("Emma", 105);

        System.out.println("My empty map after adding: " + employees);
        employees.remove("John");
        System.out.println("My empty map after removing: " + employees);
        //for printing horizontally
        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            System.out.println("Keys:=>" + entry.getKey() + "," + "Values:=>" + entry.getValue());
        }
    }
}
