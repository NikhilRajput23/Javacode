import java.util.*;

public class pattern4 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sp=1;
int st=n-1;
for(int i=0;i<=n;i++){
    for(int j=0;j<=sp;j++){
        System.out.print("  ");
    }
    for(int s=0;s<=st;s++){
        System.out.print("* ");
    }
    sp++;
    st--;
    System.out.println();
}
    }
   } 

