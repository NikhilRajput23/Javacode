import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Step 1: Check valid triangle
        if (a + b > c && a + c > b && b + c > a) {

            // Step 2: Classify
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }

        } else {
            System.out.println("Not triangle");
        }
    }
}