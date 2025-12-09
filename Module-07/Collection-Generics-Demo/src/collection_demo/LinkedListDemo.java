package collection_demo;

import java.util.LinkedList;

public class LinkedListDemo {
    static void main() {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Smith");
        list.add("John");

        System.out.println(list);
        list.push("Peter");
        System.out.println(list);
        list.pop();
        System.out.println(list);
    }
}
