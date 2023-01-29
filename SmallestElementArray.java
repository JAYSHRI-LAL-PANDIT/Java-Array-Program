public class SmallestElementArray {
    public static void main(String args[])
    {
        int arr[]=new int[]{3,2,5,8,5,2,20};
        int min=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
               min=arr[i];
        }
        System.out.print("Smallest Element in Array is:"+min);
    }
}
