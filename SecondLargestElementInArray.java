import java.util.*;
public class SecondLargestElementInArray {
    public static int secondLargestElement(Integer a[],int size){
       List <Integer> list=Arrays.asList(a);
       Collections.sort(list);
       int element =list.get(size-2);
       return element;
    }
    public static void main(String args[]){
        Integer a[]={4,0,2,4,1};
        Integer b[]={8,9,2,5,1};
        System.out.println("Second Largest Element is :"+secondLargestElement(a, 5));
        System.out.println("Second Largest Element is :"+secondLargestElement(b, 5));
    }
}
