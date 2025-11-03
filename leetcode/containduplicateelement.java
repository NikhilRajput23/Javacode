import java.util.Scanner;
import java.util.HashSet;

public class containduplicateelement {
    public boolean max(int [] nums,int k){
  HashSet<Integer>set=new HashSet<>();
  
        for(int i=0;i<nums.length;i++){
 if(set.contains(nums[i])){
    return true;
}
set.add(nums[i]);
if(set.size()>k){
 set.remove(nums[i-k]);
}
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        containduplicateelement vs=new containduplicateelement();
       boolean s=vs.max(nums,k);
       System.out.println(s);
    }
}
