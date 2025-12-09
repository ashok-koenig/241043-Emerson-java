package collection_demo;

import java.util.HashMap;

public class HashMapDemo {
    static void main() {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "John");
        employees.put(102, "Peter");
        employees.put(101, "John Smith");

        System.out.println(employees);
        System.out.println("First employee: "+ employees.get(101));
    }
}
