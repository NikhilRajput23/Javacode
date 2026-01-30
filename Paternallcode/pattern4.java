
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int s=1;s<=2*i-1;s++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
