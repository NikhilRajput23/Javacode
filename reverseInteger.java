import java.util.Scanner;

public class reverseInteger {
    public int re(int x){
        long rev=0;
        while(x!=0){
            int d=x%10;
            rev=rev*10+d;
            x=x/10;

        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
            return 0;
        }else{
            return (int)rev;
        }
    }
public static void main(String[] args) {
    Scanner sx=new Scanner(System.in);
    int x=sx.nextInt();
    reverseInteger vs=new reverseInteger();
   int a= vs.re(x);
   System.out.println(a);

}
}
