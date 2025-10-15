import java.util.Scanner;

public class Adjacent_Increasing_Subarrays_Detection_II {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    Adjacent_Increasing_Subarrays_Detection_II vs =new Adjacent_Increasing_Subarrays_Detection_II();
    int a=vs.max(arr);
    System.out.println(a);
    }
    public int max(int []arr){
        int ans=0;
        int prev=0;
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr++;
            if(i==arr.length - 1 ||arr[i]>=arr[i+1] ){
                ans=Math.max(ans,Math.max(curr/2, Math.min(prev,curr)));
                prev=curr;
                curr=0;
            }
        }
        return ans;
    }
}
