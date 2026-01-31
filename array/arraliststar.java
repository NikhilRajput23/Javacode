import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arraliststar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        ArrayList<String>lt=new ArrayList<>();
        for(int i=0;i<n;i++){
        lt.add(sc.nextLine());
        }
        Iterator <String>it=lt.iterator();
        while(it.hasNext()){
        String s=it.next();
        if(s.startsWith("A")||s.startsWith("a")){
            it.remove();
        }
        }
        System.out.println(lt);
    }

}
