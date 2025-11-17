import java.util.*;
public class arraypartition{
    public int ara(int []nums){
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length;i+=2){
            max=max+nums[i];


        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();

        }
        arraypartition vs=new arraypartition();
        int a=vs.ara(nums);
        System.out.println(a);

    }
}