import java.util.Scanner;

public class slidingwindow1 {
    public int max(int []arr,int k){
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
                    int maxx = curr;

        for(int i=k;i<arr.length;i++){
            curr+=arr[i]-arr[i-k];
            if(curr>maxx){ // we can use math,max satatement also use other max=Math.max(max,curr;

                maxx=curr;
            }
         
        }
        return maxx;
    }
public static void main(String[] args) {
    Scanner sx=new Scanner(System.in);
    int n=sx.nextInt();
    int []arr=new int[n];
for(int i=0;i<arr.length;i++){
    arr[i]=sx.nextInt();

}
int k=sx.nextInt();
slidingwindow1 s=new slidingwindow1();
int a=s.max(arr,k);
System.out.println(a);
}
}
