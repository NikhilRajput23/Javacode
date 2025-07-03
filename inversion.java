import java.util.Scanner;
public class inversion{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int inv=0;
//         int d=1;
//         while(n!=0){
//           int dd=n%10;
//             int a=d;
//             int b=dd;
//             inv=inv+a*(int)Math.pow(10,b-1);
//             n=n/10;
//             d++;
//         }
//         System.out.println(inv);
//     }
// }

     for(int div=2;div<=n;div++){
        while(n%div==0){
             n=n/div;
             System.out.println(div);

        }
     }

     }
    }