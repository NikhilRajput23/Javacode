import java.util.Arrays;
import java.util.Scanner;

public class maximumnumber3397 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();

    int  a=maximumnumber3397.max(nums, k);
    System.out.println(a);

    }
    public static int max(int[]nums,int k){
        int ans=0;
        long occupied =Long.MIN_VALUE;
        Arrays.sort(nums);
        for(int num:nums){
            if(occupied<(long)num+k){
                long start= (long)num-k;
               occupied=Math.max(occupied+1,start);
ans++;
            }
        }
        return ans;
    }
}
