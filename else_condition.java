import java.util.Scanner;

public class else_condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>90){
System.out.println("Excellent");
        
    }else if(a>80){
        System.out.println("Good");
    }
    else if(a>70 ){
        System.out.println("fair");
    }else if(a>60){
        System.out.println("More exception");
    }else{
        System.out.println("below average");
    }

    }
}
