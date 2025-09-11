import java.util.ArrayList;
import java.util.Collections;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer>lt=new ArrayList<>();
        // add element
        lt.add(1);
                lt.add(5);
        lt.add(7);
        lt.add(3);

System.out.println(lt);

//get element
int ele=lt.get(0);
System.out.println(ele);

//add of indexto another number
lt.add(0,9);
System.out.println(lt);

//set elemnt
lt.set(0,0);
System.out.println(lt);


//remove delet
lt.remove(3); 
System.out.println(lt);

//size of array

int size=lt.size();
System.out.println(size);

//loops use
for(int i=0;i<lt.size();i++){
    System.out.print(lt.get(i)+" ");
}
System.out.println();
Collections.sort(lt);
System.out.println(lt);
    }

}
