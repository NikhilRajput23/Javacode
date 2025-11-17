import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean found=false;
        for(char c:s.toCharArray()){
            if(c=='A' ||c=='E' ||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                found=true;
                break;
            }
        }
        System.out.println(found );
    }
}
