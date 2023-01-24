
public class Hello
{
   public static int thiredLargest(int arr[])
   {
      int temp;
      for(int i=0; i<arr.length; i++)
      {
         for(int j=i+1; j<arr.length; j++)
         if(arr[i]>arr[j])
         {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
         }
      }
      return arr[arr.length-3];
   }
   public static void main(String[] args) 
   {
      int arr[]={1,2,8,9,3,7};
      System.out.println("ThiredLargest Number in array is:"+thiredLargest(arr));
      
   }
   
}