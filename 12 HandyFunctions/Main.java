import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***************************************************************************************");
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(52);
        list.add(13);
        list.add(9);
        list.add(16);
        list.add(9);
        list.add(19);
        list.add(9);
        list.add(28);
        list.add(9);
        list.add(32);
        list.add(7);
        System.out.println(list);
        System.out.println("***************************************************************************************");
        System.out.println("Minimum Element is : " + Collections.min(list));
        System.out.println("***************************************************************************************");
        System.out.println("Maximum Element is : " + Collections.max(list));
        System.out.println("***************************************************************************************");
        System.out.println("Frequency of '9' in the list is : " + Collections.frequency(list,9));
        System.out.println("***************************************************************************************");
        System.out.println("Before Sorting : ");
        System.out.println(list);
        System.out.println("After Sorting : ");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("***************************************************************************************");
        System.out.println("Sorting in Reverse Order : ");
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
        System.out.println("***************************************************************************************");
    }
}