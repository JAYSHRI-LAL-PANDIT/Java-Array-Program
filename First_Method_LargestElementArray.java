//First Method to calculate Largest Element in the Array.
public class First_Method_LargestElementArray {
    public static void main(String args[])
    {
        int arr[]=new int[]{1,25,3,4,5,6,7,8,9,10};

        int max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Largest Element in the Array is: "+max);
    }
}
