  import java.util.ArrayList;
import java.util.Iterator;


public class arralistelement {
public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(60);
        list.add(80);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){    
            int x = it.next();
            if(x > 50){
                System.out.println(x); 
                break;                 
            }
        }
    }
}


