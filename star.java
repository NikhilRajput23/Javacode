// import java.util.Scanner;

// public class star{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int row=sc.nextInt();
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//     System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.*;
public class star{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
        }

    }
}