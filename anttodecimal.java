import java.util.Scanner;

public class anttodecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int f=fetp(n,r);
        System.out.println(f);
    }
    public static int fetp(int n,int r){
        int rv=0;
        int p=1;

        while(n>0){
            int dig=n%10;
            n=n/10;
            rv+=dig*p;
            p=p*r;  
        }
        return rv;
    }
}
