import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("****************************************************");
            Queue<Integer> pq = new PriorityQueue<>(); // Naturally implementing Min-heap
            pq.offer(5);
            pq.offer(3);
            pq.offer(4);
            pq.offer(1);
            pq.offer(2);
        System.out.println(pq);
        System.out.println("****************************************************");
        System.out.println(pq.peek());
        System.out.println("****************************************************");
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println("****************************************************");
            Queue<Integer> pqm = new PriorityQueue<>(Comparator.reverseOrder()); // Priority Queue implementing Max-Heap
            pqm.offer(2);
            pqm.offer(1);
            pqm.offer(4);
            pqm.offer(3);
            pqm.offer(5);
        System.out.println(pqm);
        System.out.println("****************************************************");
        System.out.println(pqm.peek());
        System.out.println("****************************************************");
        System.out.println(pqm.poll());
        System.out.println(pqm.peek());
        System.out.println(pqm);
        System.out.println("****************************************************");
    }
}