package ex_32_Collection_Framework_DSA.Queue;

import java.util.PriorityQueue;

public class Lab258_Queue {

    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        // PQ(PriorityQueue) ->follows Natural - Sorting
        System.out.println(q);
//Output of above line will be [Dutta,Pramod] because PriorityQueue will sort in ascending order
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
