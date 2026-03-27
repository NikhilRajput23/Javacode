import java.util.*;
public class number4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0 && n<=9){
            System.out.println("single digit");
        }else if(n>=10 && n<=99){
            System.out.println("Double digit");
       
        }else{
            System.out.println("milti number");
        }
    }
}