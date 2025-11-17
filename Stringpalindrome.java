import java.util.*;
public class Stringpalindrome {
    public boolean max(String s){
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
     return false;
            }else{
                l++;
                r--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stringpalindrome v=new Stringpalindrome();
    boolean a=v.max(s);
    System.out.println(a);
    }
}
