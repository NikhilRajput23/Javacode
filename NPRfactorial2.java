import java.util.*;
public class NPRfactorial2{
public static int fact(int x){
    int rv=1;
    for(int i=1;i<=x;i++){
        rv*=i;
    }
    return rv;

}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=fact(n);
        
        int nrfact=fact(n-r);

        
        int twofact=nfact/nrfact;
           System.out.println(n+"p"+r);
           System.out.println(twofact);

        }
}
