public class SecondLargestElementOfArray {
    public static void main(String args[]){
      int arr[]=new int[]{1,4,2,8,9};
      System.out.println("Original Array :");
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");

      }
      int temp=0;
      for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr.length; j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
      }

      System.out.println();
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      System.out.println("Second Largest Element is "+arr[arr.length-2]);
    
    }
}
