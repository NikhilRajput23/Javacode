import java.util.Scanner;

public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=CalculateMoneyInLeetcodeBank.max(n);
        System.out.println(a);
        
    }
    public static int max(int n){
        int t=0;
        int week=1;
        while(n>0){
            int days=Math.min(n,7);
 for(int i=0;i<days;i++){
    t+=week+i;

            }
            week++;
            n-=7;
        }
        return t;
    }
}
