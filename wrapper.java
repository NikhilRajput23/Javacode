import java.util.*;

public class wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];

        System.out.println("Enter " + a + " elements:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt(); 

        if (b >= 0 && b < a) {
            System.out.println(index(arr, b)); 
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static int index(int[] arr, int i) {
        return arr[i];
    }
}
