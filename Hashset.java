import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("Set Size is:"+set.size());
        // System.out.println(set);
        // if(set.contains(1)){
        //     System.out.println("value exist");
        // }
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("value nahi aahe ");
        // }
 Iterator it=set.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}

    }
}
