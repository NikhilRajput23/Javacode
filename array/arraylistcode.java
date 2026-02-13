import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arraylistcode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>lt=new ArrayList<>();
        for(int i=0;i<n;i++){
            lt.add(sc.nextInt());
        }
        Iterator <Integer>it = lt.iterator();
        while(it.hasNext()){
            int x=it.next();
            if(x%2==0){
                it.remove();
            }
        }
        System.out.println(lt);
    }
}
