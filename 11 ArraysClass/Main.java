import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("*************************************************************");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(arr,2);
        System.out.println("Index of element 2 in the array is : " + index);
        System.out.println("*************************************************************");
        int[] num = {5,1,3,2,9,7,4,6,8};
        System.out.println("Before Sorting : ");
        for(int x : num)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("After Sorting : ");
        Arrays.sort(num);
        for(int x : num)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("*************************************************************");
        int[] temp = {1,4,5,6,78,9,6,3,2,0,12,3};
        for(int x : temp)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        Arrays.fill(temp,0);
        for(int x : temp)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("*************************************************************");
    }
}