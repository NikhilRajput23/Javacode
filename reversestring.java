import java.util.Scanner;

public class reversestring {
    public void reverseString(char[] s) {
        int a=0;
        int b=s.length-1;
        while(a<b){
         char temp=s[a]; 
         s[a]=s[b];
         s[b] =temp;
         a++;
         b--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String aa= sc.nextLine();
        char[] arr=aa.toCharArray();
   reversestring r=new reversestring();
     r.reverseString(arr);
     System.out.println(new String(arr));


        
    }
}