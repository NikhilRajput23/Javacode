import java.util.Scanner;
    public class anybase_to_anybase{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int b1=sc.nextInt();
        int b2=sc.nextInt();

    int d=any(n,b1,b2);
    System.out.println(d);
}
public static int any (int n,int b1, int b2){
int dec=anytodecimal(n,b1);
int dn=decimaltoany(dec,b2);
return dn;

}
public static int anytodecimal(int n,int r){
        int rv=0;
        int p=1;

        while(n>0){
            int dig = n%10;
            n = n/10;
            rv += dig*p;
            p=p*r;  
        }
        return rv;
    }

 public static int decimaltoany(int n,int b){
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