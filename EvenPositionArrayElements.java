public class EvenPositionArrayElements {
    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println("Array Element on Even Position:");
        for(int i=1; i<arr.length; i+=2)
        {
            System.out.println(arr[i]);
        }
    }
}
