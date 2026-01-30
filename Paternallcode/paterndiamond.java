import java.util.Scanner;

public class paterndiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int s=1;s<=i;s++){
                System.out.print(" *");
            }
            System.out.println();
        }
                for(int i=n;i>=1;i--){
                    for(int j=n;j>i;j--){
                        System.out.print(" ");
                    }
                    for(int s=1;s<=i;s++){
                        System.out.print(" *");
                    }
                                                        System.out.println();

                }

}
}