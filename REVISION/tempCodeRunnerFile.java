import java.util.*;

public class number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
    int m=sc.nextInt();
        if (n > s && n>m) {
            System.out.println("Larger number is: " + n);
        } else if (s > n && s>m) {
            System.out.println("Larger number is: " + s);
        } else if(m>n && m>s){
       System.out.println("Larger number is: " + m);
        }
            else {
            System.out.println("Both numbers are equal");
        }
    }
}