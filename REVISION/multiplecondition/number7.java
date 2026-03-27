import java.util.Scanner;

public class number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both Even");
        } 
        else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Both Odd");
        } 
        else {
            System.out.println("One Even and One Odd");
        }
    }
}