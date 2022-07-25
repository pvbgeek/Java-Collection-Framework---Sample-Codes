import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("************************************************************");
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue);
        System.out.println("************************************************************");
        System.out.println(queue.peek());
        System.out.println("************************************************************");
        System.out.println(queue.poll()); // returns false if queue is empty
        System.out.println("************************************************************");
        System.out.println(queue.peek()); // returns null if queue is empty
        System.out.println(queue);
        System.out.println("************************************************************");
    }
}