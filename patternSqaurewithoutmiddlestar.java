import java.util.Scanner;

public class patternSqaurewithoutmiddlestar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        for(int i=1;i<=n;i++){
         for(int j=1;j<=r;j++){
         if(i==1 ||j==1||i==n||j==r){
            System.out.print("*");
         }else{
            System.out.print(" ");
         }
            }
            System.out.println();
        }
    }
}
