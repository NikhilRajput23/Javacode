import java.util.*;

public class number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int d1 = n % 10;
        int d2 = (n / 10) % 10;
        int d3 = n / 100;

        if(d1 != d2 && d2 != d3 && d1 != d3){
            System.out.println("Distinct");
        } else {
            System.out.println("Not distinct");
        }
    }
}