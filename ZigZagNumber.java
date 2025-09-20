import java.util.Scanner;

public class ZigZagNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == (n - i + 1)) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
