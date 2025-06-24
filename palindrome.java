// import java.util.Scanner;

// public class palindrome {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//   int n=sc.nextInt();
//   int a=n;
//   int b=0;
//   while(a>0){
//     int d=a%10;
//     b=b*10+d;
//     a=a/10;

//   }
//       if(b==n){
//         System.out.println("palindrome");
//       }else{
//         System.out.println("not palindrome");
//       }

//     }
// }
// import java.util.*;
// public class palindrome{
//   public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int t=n;
//     int d=0;
//     while(t>0){
//       int b=t%10;
//       d=d*10+b;
//       t=t/10;

//     }

//  System.out.println(n);
//   }
// }
 
import java.util.Scanner;
 public class palindrome {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a=n;
  int b=0;
  while(a>0){
    int d=a%10;
    b=b*10+d;
    a=a/10;

  }
     System.out.println(b);
    }
}