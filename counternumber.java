// import java.util.Scanner;

// public class countnumber {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int d=0;
//         while(n!=0){
//             n=n/10;
//             d++;

//         }
//         System.out.println(d);
        
//     }
// }

// import java.util.Scanner;
//  public class countnumber {
//      public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int d=0;
//         int temp=n;

//         while(temp!=0){
//              temp=temp/10;
//              d++;

//         }
//         int div=(int)Math.pow(10, d-1);
//         while(div !=0){
//           int m=n/div;
//           System.out.println(m);
//           n=n%div;
//            div=div/10;
//         }
        
//      } 
//     }
// import java.util.Scanner;
// public class countnumber{
//     public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// for(;a>0;a=a/10){
//     int d=a%10;
   
//    System.out.println(d);
// }
//     }
// }

// import java.util.Scanner;

// public class countnumber{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int inv=0;
//         int  d=1;
//         while(n!=0){
//           int dd=n%10;
//           int a=d;
//           int b=dd;

//           inv=inv+ a*(int)Math.pow(10, b-1);
//           n=n/10;
//           d++;
//         }
//         System.out.println(inv);
//     }
// } 

import java.util.*;
public class counternumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        while(n!=0){
        n=n/10;
        d++;
        }
        System.out.println(d);
    }
}