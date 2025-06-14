import java.util.*;

public class abba{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();   
        String c=new StringBuilder(a).reverse().toString();
        if(b.equals(c)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}