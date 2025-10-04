import java.util.*;
public class arraymountain{
    public static boolean validMountainArray(int[] arr) {
        int peak=0;
    if(arr.length<3){
        return false;
    }
    for(int i =1;i<arr.length-1;i++){
        int prev=arr[i-1];
        int curr=arr[i];
        int next=arr[i+1];
        if(prev==curr || curr==next){
            return false;
        }
        if(prev>curr && curr<next){
            return false;
        }
        if(prev<curr && curr>next){
            peak++;
            if(peak>1){
                return false;
            }
        }
    }
    return peak==1;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
            }
            boolean s=arraymountain.validMountainArray(arr);
            System.out.println(s);

    }
}