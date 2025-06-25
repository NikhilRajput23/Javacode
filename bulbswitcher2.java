import java.util.Scanner;

public class bulbswitcher2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int press = sc.nextInt();

        if (press == 0) {
            System.out.println(1);
        } else if (n == 1) {
            System.out.println(2);
        } else if (n == 2) {
            if (press == 1) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        } else {
            if (press == 1) {
                System.out.println(4);
            } else if (press == 2) {
                System.out.println(7);
            } else {
                System.out.println(8);
            }
        }
    }
}
