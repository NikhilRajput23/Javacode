import java.util.Scanner;

public class Deciaml_to_anyBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int b=sc.nextInt();
           int f=power(n,b);
           System.out.println(f);
    }
    public static int power(int n,int b){
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%b;
            n=n/b;
        rv+=dig*p;
        p=10*p;

        }
        return rv;

    }
}
