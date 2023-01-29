public class SumOfElementsOfArray {
    static public void main(String args[])
    {
        int arr[]=new int[]{2,3,5,4,6,8,9};

        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of elements of Array is:"+sum);
    }
}
