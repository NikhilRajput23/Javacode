import java.util.*;

public class first {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
                ArrayList<Integer>l2=new ArrayList<>(3);

        l1.add(1);
         l1.add(2);
        l1.add(3);
     l1.add(4);
     l2.add(12);
          l2.add(13);

               l2.add(14);

                    l2.add(15);

     l1.addAll(l2);
 for(int i=0;i<l1.size();i++){
    System.out.println(l1.get(i)+"");
  }
 System.out.println(l1.contains(4));
 System.out.println(l1.set(0,12));
    }
}
