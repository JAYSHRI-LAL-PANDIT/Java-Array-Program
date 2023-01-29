import java.util.*;
public class ThridLargestNumberInArray {
    public static int getThriedNumber(int arr[],int size){
        Arrays.sort(arr);
        return arr[size-3];
    }
    public static void main(String args[]){
        int arr[]=new int []{3,6,9,1,0};
        int a[] =new int []{88,33,44,55,66};
        System.out.println("Third Largest number in array is : "+getThriedNumber(arr, 5));
        System.out.println("Third Largests number in array is :"+getThriedNumber(a, 5));
    }
}
