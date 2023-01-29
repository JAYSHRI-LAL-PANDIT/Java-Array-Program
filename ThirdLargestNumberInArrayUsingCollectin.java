import java.util.*;
public class ThirdLargestNumberInArrayUsingCollectin {
    public static int getThriedNumber(Integer a[],int size){

        List<Integer> list=Arrays.asList(a);
        Collections.sort(list);
        int element =list.get(size-3);
        return element;
    }
    public static void main(String args[]){
        Integer a[]={2,8,0,1,6};
        Integer b[]={5,1,9,44,33};
        System.out.println("Third Largest Number is : "+getThriedNumber(a, 5));
        System.out.println("Third Largest Number is :"+getThriedNumber(b, 5));
    }
}
