package collection_demo;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");  // duplicates allowed

        System.out.println(list);
        System.out.println("First Item:"+ list.get(0));
        list.remove(0);
        list.remove("Python");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
