// import java.util.Scanner;

// public class primefactor {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int div=2;div<=n;div++){
// while(n%div==0){
//               n=n/div;
//             System.out.print(div);
//         }
//     }
      
//         }
//         }

import java.util.Scanner;

public class primefactor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int count=0;
        for(int div=2;div*div<=n;div++){
           if(n%div==0){
            count++;
           }
        }
           if(count==0){
            System.out.println("prime");
           }else{
            System.out.println("Not prime");
           }
        }
    }
}