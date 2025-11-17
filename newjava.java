import java.util.*;
interface bycycle{
  void brake(int decrement);
  void fast(int increment);
}
abstract class atlest implements bycycle{
    Scanner sc=new Scanner(System.in);
    int a;
      atlest(){
         a=sc.nextInt();
    }
    public void brake(int decrement){
        a=a-decrement;

    }
    public void fast(int increment){
        a=a+increment;
    }
    void print(){
        System.out.println(a);
    }
}


class mycycle extends atlest{
}

public class newjava{
public static void main(String[] args) {
    mycycle b=new mycycle();
    b.fast(10);
    b.brake(3);
    b.print();
}
}

