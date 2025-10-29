import java.util.Scanner;

public class smallestnumberallset {
    public static int max(int n){
        int x=0;
        while(n>x){
            x=x*2+1;
        }
        return x;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=smallestnumberallset.max(n);
        System.out.println(a);
    }
}
