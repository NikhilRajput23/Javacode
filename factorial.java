import java.util.Scanner;

public class factorial{
    public static int fact(int n){
        if(n<0){
            return 0;
        }
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact*=i;
           
           
        }
        return nfact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=fact(n);
        System.out.println(sum);
        
    }
}