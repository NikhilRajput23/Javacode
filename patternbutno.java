import java.util.Scanner;

public class patternbutno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            sp--;
            System.out.println();
        }
    }
}
