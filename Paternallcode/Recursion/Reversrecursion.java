    import java.util.*;
    public class Reversrecursion {
        static void rec(int []arr,int left,int right){
            if(left>=right){
                return ;
            }
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        rec(arr,left+1,right-1);
        }
        public static void main(String[] args) {
        int []arr={1,2 ,3,4,5};
        rec(arr,0,arr.length-1);
    for(int x:arr){
        System.out.print(x+" ");
    }
        }
    }
