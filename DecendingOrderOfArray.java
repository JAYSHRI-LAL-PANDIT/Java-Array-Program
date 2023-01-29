public class DecendingOrderOfArray {
    public static void main(String args[])
    {
        int arr[]=new int []{8,9,4,3,7,2,1};

        System.out.println("Original Array Elements:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
       int temp=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array After Arrangement in Decending Order:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
