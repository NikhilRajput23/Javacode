import java.util.Scanner;

public class arrayelemtmake0 {
    public static int max(int[]nums){
        int ans=0;
        int prefix=0;
        int suffix=0;
        for(int n:nums){
            suffix+=n;
        }
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            suffix-=nums[i];
            if(nums[i]>0){
                continue;
            }
            if(suffix==prefix){
                ans+=2;
            }else if(Math.abs(prefix-suffix)==1){
                ans+=1;
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int []nums=new int[c];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int a=arrayelemtmake0.max(nums);
        System.out.println(a);
    }
}
