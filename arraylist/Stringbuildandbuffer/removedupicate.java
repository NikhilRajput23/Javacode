import java.util.Scanner;

public class removedupicate {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String s=sc.nextLine();
           StringBuilder sb=new StringBuilder(s);
           for(int i=0;i<sb.length();i++){
            for(int j=i+1;j<sb.length();){
              if(sb.charAt(i)==sb.charAt(j)){
                 sb.deleteCharAt(j);
                
                 }else{
   j++;
                 }
              
              }
              }
           
           System.out.println(sb);

    }
}
