import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String lastName=sc.nextLine();
        String fullname=name+"@"+ lastName;
        System.out.println("Your name is = "+fullname);
        System.out.println(fullname.length());

        System.out.println("Check Character");
        char ch=sc.next().charAt(0);
        boolean found=false;
        for(int i=0;i<fullname.length();i++){
            if(fullname.charAt(i)==ch){
            found =true;
             System.out.println(true);
            }
            if (!found) {
            System.out.println("Character '" + ch + "' not found in fullname.");
        }
            
        }


    }
}
