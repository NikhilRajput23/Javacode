import java.util.*;
public class random {
    public static void main(String[] args) {
        String all="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345567890@!#$%^&*()?";
        int length=6;
        String pass="";
        Random number=new Random();
        for(int i=0;i<length;i++){
            int index=number.nextInt(all.length());
            pass+=all.charAt(index);

        }
        System.out.println(pass);
    }
}
