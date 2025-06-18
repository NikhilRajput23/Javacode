// import java.util.Scanner;

// public class palindrome {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//   int n=sc.nextInt();
//   int a=n;
//   int b=0;
//   while(a>0){
//     int d=n%10;
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
import java.util.*;
public class palindrome{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int d=0;
    while(temp!=0){
      temp=temp/10;
      d++;
      
    }
   
 System.out.println(d);
  }
}