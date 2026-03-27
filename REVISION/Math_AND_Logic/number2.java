    import java.util.Scanner;

    public class number2{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            
            int d1 = n % 10;
            int d2 = (n / 10) % 10;
            int d3 = n / 100;
            if(d2>d1 && d2>d3){
                System.out.println("middle one lagest");
            }else if(d2<d1 && d2<d3){
                System.out.println("middle is small");
            }else{
                System.out.println("Neither");
            }
        }
    }