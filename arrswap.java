import java.util.*;
class Main{
    public  static void swap(int[]arr, int i ,int  j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
    }
}

public class arrswap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
         for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
         }
         System.out.print("I value :");
         int i=sc.nextInt();
          System.out.print("J value :");
         int j=sc.nextInt();
        
        
  Main.swap(arr,i,j);
   for( i=0;i<arr.length;i++){
    System.out.println(arr[i]);
   }

    }
}