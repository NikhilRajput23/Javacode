package kadanealgo;

import java.util.Scanner;

public class kadanealgo1 {
    public int macx(int []nums){
        int max=nums[0];
        int curr=0;
        for(int n:nums){
         curr+=n;
         max=Math.max(max, curr);
         if(curr<0){
            curr=0;
         }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        kadanealgo1 vs=new kadanealgo1();
        int a=vs.macx(arr);
        System.out.println(a);
    }
}
