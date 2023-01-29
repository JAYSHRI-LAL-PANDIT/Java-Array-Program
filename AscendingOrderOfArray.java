public class AscendingOrderOfArray {
    static public void main(String args[])
    {
        int arr[]=new int[]{5,6,3,6,1,2};
        int temp=0;
        System.out.println("Original Array :");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array after arranging in Ascending order:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
