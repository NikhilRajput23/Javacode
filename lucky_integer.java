import java.util.Scanner;

public class lucky_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
               for(int j=0;j<n;j++){
        arr[j]=sc.nextInt();
               }
               int freq[] =new int[501];
               for(int i:arr){
                freq[i]++;
               }
               for(int i=500;i>0;i--){
                if(i==freq[i]){
                    System.out.println(i);
                    return;

                }
               }
               System.out.println(-1);
    }
}
