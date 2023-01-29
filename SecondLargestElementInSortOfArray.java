import java.util.*;
public class SecondLargestElementInSortOfArray {
    public static int secondLargestElement(int a[],int size){
        Arrays.sort(a);
        return a[size-2];
    }
    public static void main(String args[]){
        int a[]={6,3,9,1,5};
        int b[]={0,2,11,20,5};
        System.out.println("Second Largest : "+secondLargestElement(a, 5) );
        System.out.println("Second Largest : "+secondLargestElement(b, 5));
    }
}
