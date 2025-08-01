import java.util.*;
public class anytoanyaddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int d=getsum(n,b1,b2);
        System.out.println(d);
    }
    public static int getsum(int n,int b1,int b2){
   int rv=0;
   int c=0;
   int p=1;
   while(b1 > 0 || b2 > 0 || c > 0){
    int n1=b1%10;
    int n2=b2%10;
    b1=b1/10;
    b2=b2/10;
    int sum= n1+n2+c;
    c=sum/n;
    sum=sum%n;
    rv+=sum*p;
    p=p*10;

   }
   return rv;
    }
}
