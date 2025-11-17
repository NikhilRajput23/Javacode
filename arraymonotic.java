import java.util.*;
public class arraymonotic{
    public boolean arrayp(int[]nums){
        boolean in=true;
        boolean de=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                de=false;

            }
             if(nums[i]<nums[i-1]){
             in=true;
   }
            
        }
           return in || de;

    
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
            arraymonotic vs=new arraymonotic();
            boolean s=vs.arrayp(nums);
            System.out.println(s);
        
    }
}