import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("**************************************************");
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println(set);
        System.out.println("**************************************************");
        set.remove(54);
        System.out.println(set);
        System.out.println("**************************************************");
        System.out.println(set.contains(21));
        System.out.println(set.contains(100));
        System.out.println("**************************************************");
        System.out.println(set.size());
        System.out.println("**************************************************");
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set);
        System.out.println("**************************************************");
    }
}