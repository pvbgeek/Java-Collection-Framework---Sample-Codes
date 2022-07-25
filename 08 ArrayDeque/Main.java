import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("********************************************************");
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(26);
        System.out.println(adq);
        System.out.println("********************************************************");
        System.out.println(adq.peek());
        System.out.println("********************************************************");
        System.out.println(adq.peekFirst());
        System.out.println("********************************************************");
        System.out.println(adq.peekLast());
        System.out.println("********************************************************");
        System.out.println(adq.poll());
        System.out.println(adq);
        System.out.println("********************************************************");
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        System.out.println("********************************************************");
        System.out.println(adq.pollLast());
        System.out.println(adq);
        System.out.println("********************************************************");
    }
}