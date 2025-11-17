import java.util.Scanner;

public class power_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean f=power_of_three.powerthree(n);
        System.out.println(f);
    }
    public static boolean powerthree(int n){
        if(n<1){
            return false;
        }
        while(n%3==0){
            n=n/3;

        }
        
        return n==1;
    }

}
