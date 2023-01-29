public class PrintOddEvenElementInArray {
    public static void main(String args[]){
        int arr[]={4,9,2,6,1,3};
        System.out.println("Odd numbers is : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+"  ");
            }
        }
        System.out.println();
        System.out.println("Even number is :");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+"  ");
            }
        }
    }
}
