import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("****************************************************************");
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Dog");
        System.out.println("Stack : " + animals);
        System.out.println("****************************************************************");
        System.out.println(animals.peek());
        System.out.println("****************************************************************");
        animals.pop();
        System.out.println(animals.peek());
        System.out.println("Stack : " + animals);
        System.out.println("****************************************************************");
    }
}