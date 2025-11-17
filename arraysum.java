import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int []arr1=new int[n];
        int []sum=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int n1=sc.nextInt();
        for(int j=0;j<n;j++){
            arr1[j]=sc.nextInt();
        }
        for(int s=0;s<n;s++){
            sum[s]=arr[s] + arr1[s];
        }
        

   System.out.println("Resultant Sum Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(sum[i] + " ");

    }
}
}
