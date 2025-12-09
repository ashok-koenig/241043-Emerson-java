package collection_demo;

import java.util.*;

public class EnumerationIteratorDemo {
    public static void main(String[] args) {

        // Enumeration on Vector (Legacy)
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");

        System.out.println("Using Enumeration:");
        Enumeration<String> e = vector.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // Iterator on ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        System.out.println("\nUsing Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String item = it.next();
            System.out.println(item);
            if(item.equals("Y")) {
                it.remove(); // allowed
            }
        }

        System.out.println("\nList after removal: " + list);
    }
}

