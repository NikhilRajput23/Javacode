import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long r=sc.nextLong();
      
        int f=getDigitFrequency(n, r);
        System.out.println(f);
    }
    public static int getDigitFrequency(long n,long r){
      long rv=0;
      while(n>0){
        long dig=n%10;
        n=n/10;
        if(dig==r){
            rv++;
        }

      }

      return (int) rv;
    }
}   
