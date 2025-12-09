package collection_demo;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(20);
        pq.add(10);
        pq.add(30);

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
