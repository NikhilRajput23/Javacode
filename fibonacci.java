import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
       int n=Sc.nextInt();
       int result=solution.fib(n);
       System.out.println(n+" "+ result);
    }
}
       class solution{
      public static int fib(int n){
        if(n==0){
           return 0;
        }else if(n==1){
            return 1;
        }
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;

        }
        return a;
        
    }

      public void twosum() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'twosum'");
      }
}
