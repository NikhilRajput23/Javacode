        import java.util.Scanner;

public class number3 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            
            int d1 = n % 10;
            int d2 = (n / 10) % 10;
        int d3 = (n / 100) % 10;
            int d4 = n / 1000;
        if(d4==d1){
            System.out.println("are equal");
        }else{
            System.out.println("are not equal");
        }
}
}