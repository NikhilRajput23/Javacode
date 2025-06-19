import java.util.*;
public class nth_tribonncci {

    public static int tribonacci(int n){
    if(n==0){
        return 0;

    }else if(n==1 || n==2){
return 1;
    }
    int a=0;
    int b=1;
    int c=1;
    int d=0;
    for(int i=1;i<=n;i++){
 d=a+b+c;
a=b;
b=c;
c=d;
    }
    return a;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
      
          System.out.println(tribonacci(n));
           

        
    }
}
