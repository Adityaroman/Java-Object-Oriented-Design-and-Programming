package mypackage;
//Define a class named Person
class Person {
 // Attributes (properties) of the Person class
 String name;
 int age;

 // Constructor to initialize Person object
 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to display person details
 void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Define a class named Address
class Address {
 String city;
 String state;

 // Constructor to initialize Address object
 Address(String city, String state) {
     this.city = city;
     this.state = state;
 }

 // Method to display address details
 void displayAddress() {
     System.out.println("City: " + city);
     System.out.println("State: " + state);
 }
}

//Define a class named Employee that uses composition
class Employee {
 Person person; // Composition: Employee has a Person
 Address address; // Composition: Employee has an Address

 // Constructor to initialize Employee with Person and Address
 Employee(Person person, Address address) {
     this.person = person;
     this.address = address;
 }

 // Method to display employee details
 void displayEmployeeDetails() {
     person.displayInfo(); // Use Person's method
     address.displayAddress(); // Use Address's method
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     // Create Person object
     Person person = new Person("John Doe", 30);

     // Create Address object
     Address address = new Address("New York", "NY");

     // Create Employee object using composition
     Employee employee = new Employee(person, address);

     // Display employee details
     employee.displayEmployeeDetails();
 }
}
