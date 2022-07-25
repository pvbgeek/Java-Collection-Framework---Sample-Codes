import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("********************************************");
        Map<String,Integer> num = new HashMap<>();
        num.put("ONE",1);
        num.put("TWO",2);
        num.put("THREE",3);
        num.put("FOUR",4);
        num.put("FIVE",5);
        System.out.println(num);
        System.out.println("********************************************");
        num.putIfAbsent("SIX",6);
        num.putIfAbsent("FOUR",40);
        System.out.println(num);
        System.out.println("********************************************");
        System.out.println(num.containsKey("THREE"));
        System.out.println(num.containsKey("SEVEN"));
        System.out.println("********************************************");
        System.out.println(num.containsValue(2));
        System.out.println(num.containsValue(8));
        System.out.println("********************************************");
        System.out.println(num);
        num.remove("SIX");
        System.out.println(num);
        System.out.println("********************************************");
        for(Map.Entry<String,Integer> e : num.entrySet())
        {
            System.out.println(e);
        }
        System.out.println("********************************************");
        for(Map.Entry<String,Integer> e : num.entrySet())
        {
            System.out.println(e.getKey() + " is " + e.getValue());
        }
        System.out.println("********************************************");
        System.out.println("Keys are ----");
        for(String k : num.keySet())
        {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("********************************************");
        System.out.println("Values are ----");
        for(Integer v : num.values())
        {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("********************************************");
        System.out.println(num.isEmpty());
        num.clear();
        System.out.println(num.isEmpty());
        System.out.println("********************************************");
    }
}