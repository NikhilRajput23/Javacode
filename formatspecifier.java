 public class formatspecifier {
    public static void main(String[] args) {
        int x = 100;
        float z = (float) Math.PI;

        System.out.printf("Value of PI = %.2f\n", z); 
      
        System.out.format("Value of PI = %5.2f\n", z); 
      
        System.out.format("Value of PI = %05.2f\n", z); 
    }
}