public class ThridLargestNumberUsingMethodInArray {
    public static int getThriedNumber(int arr[]){

        int temp=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
               if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               }
            }
        }
        return arr[arr.length-3];
    }
    public static void main(String arsg[]){
        int arr[]=new int[]{3,4,2,6,8};
        int a[]=new int[]{22,55,11,88,99};
        System.out.println("Thired Largest Number is :"+getThriedNumber(arr));
        System.out.println("Thired Largest Number is :"+getThriedNumber(a));
    }
}
