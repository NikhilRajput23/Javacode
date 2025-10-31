import java.util.*;

public class Twosnekynumber3281 {
    public int[] max(int []nums){
        int count[]=new int[101];
        int []ans=new int[2];
        int j=0;
        for(int x:nums){
            count[x]++;
            if(count[x]==2){
                ans[j++]=x;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();

        }
        Twosnekynumber3281 vs=new Twosnekynumber3281();
        int []a=vs.max(nums);
        System.out.println(Arrays.toString(a));
    }
}
