import java.util.*;
public class  findperimetr_of_triangle{
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            int a=nums[i-2];
                        int b=nums[i-1];
            int c=nums[i];
            if(a+b>c){
                return a+b+c;
            }

        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
       findperimetr_of_triangle vn =new findperimetr_of_triangle();
      int ans= vn.largestPerimeter(nums);
       System.out.println(ans);
    }
}