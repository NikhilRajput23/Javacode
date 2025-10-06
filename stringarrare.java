import java.util.*;
public class stringarrare{
    public static void main(String[]args){
       Scanner sc =new Scanner(System.in);
       String s=sc.nextLine();
      String re=new StringBuilder(s).reverse().toString();
      System.out.println(re);
    }
}
  