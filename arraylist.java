import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer>a =new ArrayList<>();
          a.add(2);
          a.add(1);
          a.add(5);
          a.add(8);
          
          System.out.println(a);
       a.remove(1);
       System.out.println(a);
       a.get(2);
       System.out.println(a);
       a.set(0, 6);
       System.out.println(a);

    }
}
