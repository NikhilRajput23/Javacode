import java.util.*;
public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("Nikhil");
        list.addFirst("I am");
        System.out.println(list);
        list.addLast("Rajput");
        System.out.println(list);
        System.out.println(list.size());
        list.set(1,"nik");
        System.out.println(list);
        System.out.println(list.getLast());

    }
}
