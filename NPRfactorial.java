import java.util.*;
public class NPRfactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact*=i;

        }
        int nrfact=1;
        for(int i=1;i<=n-r;i++){
            nrfact*=i;

        }
        int twofact=nfact/nrfact;
           System.out.println(n+"p"+r);
           System.out.println(twofact);

        }
}
