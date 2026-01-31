import java.util.Scanner;

public class stringall{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
          String sn=sb.reverse().toString();
          if(s.equals(sn)){
            System.out.println("palindrome");
          }else{
    System.out.println("not palndrome");

          }

    }
}