
import java.util.*;

public class NumberofLaserBeamBank {
    public int re(String []bank){
        int prev=0;
        int total=0;
        for(String row:bank){
            int curr=0;

        
        for(char c:row.toCharArray()){
          if(c=='1'){
            curr++;
          }
        }
        if(curr>0){
 total+=prev*curr;
 prev=curr;
        }
    }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String [] bank=new String[n];
        for(int i=0;i<n;i++){
            bank[i]=sc.nextLine();
        }
        NumberofLaserBeamBank s=new NumberofLaserBeamBank();
        int  a=s.re(bank);
        System.out.println(a);
    }
}
