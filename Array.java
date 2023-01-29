
class Array
{ 
    public static void main(String args[])
    {
       int arr1[]={1,2,3,4,5};
       int arr2[]=new int[arr1.length];

       for(int i=0; i<arr1.length; i++)
       {
          arr2[i]=arr1[i];
       }

       System.out.println("Original array elementS are:");

       for(int i=0; i<arr1.length; i++)
       {
          System.out.println(arr1[i]);
       }

       System.out.println("After copying array elements are:");

       for(int i=0; i<arr2.length; i++)
       {
        System.out.println(arr2[i]);
       }
    }
}