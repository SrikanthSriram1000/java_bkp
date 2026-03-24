package com.shallowcopy;


public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Hyderabad");
        Employee emp1 = new Employee("Alice", addr);

        // Create a shallow copy
        Employee emp2 = (Employee) emp1.clone();

        // Modify the city in the copied object
        emp2.address.city = "Bangalore";
        emp2.setName("Bob");
        

        // Both objects are affected because they share the same Address object
        System.out.println(emp1); // Output: Bangalore
        System.out.println(emp2); // Output: Bangalore
    }
}
