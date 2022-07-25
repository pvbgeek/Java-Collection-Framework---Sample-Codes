import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***************************************************");
        ArrayList<String> sname = new ArrayList<>();
        sname.add("Rakesh");
        sname.add("Ramesh");
        sname.add("Kaiwalya");
        sname.add("Parth");
        sname.add("Soham");
        sname.add("Ameya");
        System.out.println(sname);
        System.out.println("***************************************************");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println("***************************************************");
        list.add(5,6);
        list.add(6,7);
        list.add(7,8);
        list.add(8,9);
        list.add(9,10);
        System.out.println(list);
        System.out.println("***************************************************");
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i=11 ; i<=15 ; i++)
        {
            newList.add(i);
        }
        System.out.println(newList);
        list.addAll(newList); // To add another arraylist in an existing one
        System.out.println(list);
        System.out.println("***************************************************");
        System.out.println("Element at Index 10 is : " + list.get(9));
        System.out.println("***************************************************");
        System.out.println(list);
        list.remove(14);
        System.out.println(list);
        list.remove(Integer.valueOf(14));
        System.out.println(list);
        System.out.println("***************************************************");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println("***************************************************");
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.set(1,2); // To set value at a given index
        System.out.println(list);
        System.out.println("***************************************************");
        System.out.println(list.contains(4));
        System.out.println(list.contains(6));
        System.out.println("***************************************************");
        for(int i=0 ; i<list.size() ; i++)
        {
            System.out.println("Element is : " + list.get(i));
        }
        System.out.println("***************************************************");
        for(Integer x : list)
        {
            System.out.println("Element is : " + x);
        }
        System.out.println("***************************************************");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println("Element is : " + it.next());
        }
        System.out.println("***************************************************");
    }
}