

import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c && c==a){
            System.out.println("EQUALITERAL");
        }else if(a==b || b==c || c==a){
           System.out.println("isoscels");
        }else if(a!=b && b!=c && c!=a ){
            System.out.println("Scalen");
        }else{
            System.out.println("not triangle");
        }
    }
}
