public class Second_Method_LargestElementArray {
      public static int getLargestNumber(int a[],int size){
        int temp;
          for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++)
            {
               if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
               }
            }
          }
          return a[size-1];
      }

      public static void main(String args[]){
        int a[]={4,9,2,5,1};
        int b[]={0,333,44,11,888};
        System.out.println("Largest Number is : "+getLargestNumber(a, 5));
        System.out.println("Largest Number is : "+getLargestNumber(b, 5));
        
      }


}
