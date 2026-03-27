import java.util.*;
public class number5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=5 && n<=11){
            System.out.println("GOOD MORNING");
        } else if(n>=12 && n<=16){
            System.out.println("GOOD AFTERNOON");
        } else if(n>=17 && n<=20){
            System.out.println("GOOD EVENING");
        } else if (n < 0 || n > 23) {
            System.out.println("Invalid hour");
        }else{
            System.out.println("GOOD NIGHT");
        }
    }
}
