import java.util.*;
public class swaptwonumberwithot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int r=sc.nextInt();
         n=n^r;
         r=n^r;
         n=n^r;
         System.out.println(n+" "+r);
    }
}
