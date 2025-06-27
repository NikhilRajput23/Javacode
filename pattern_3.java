import java.util.*;
public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int st=1;
int sp=n-1;
        for(int i=1;i<=n;i++){
        for(int j=1;j<=sp;j++){
                System.out.print("  ");
        }
         for(int s=1;s<=st;s++){
                System.out.print("* ");
        }
               sp--;
               st++;
                System.out.println();
            
            
        }
        
    }
}
    


