// import java.util.Scanner;

// public class aarayreve {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int [] arr=new int[a];
//       for(int i=0;i<arr.length;i++){
//         System.out.println((i));
//     }
// }
// }


import java.util.*;
public class arrayreverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ab=a;
        int ba=b;
        while(a%b!=0){
            int dd=a%b;
            a=b;
            b=dd;
        }
        int gcd=b;
        int lcm=(ab*ba)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        
    }
}
