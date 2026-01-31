import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arraylistcount {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<String> lt=new ArrayList<>();
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        lt.add(sc.nextLine());
    }
    int count=0;
    Iterator <String> it=lt.iterator();
    while(it.hasNext()){
        it.next();
        count++;
    }
    System.out.println(count);

}
    
}