import java.util.Scanner;

public class allprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int count =0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                count++;
                break;
                
            }
        }
        if( count==0){
            System.out.println(i);
        }
    }}

}
