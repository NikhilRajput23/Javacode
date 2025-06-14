import java.util.Scanner;

class nik{
    public void show(int a,int b){
       
        int c=a+b;
        System.out.println(c);
    }
public void show(int z,int x,int v){
        
        int c=z+x+v;
        System.out.println(c);

    }
   
}
class kir extends nik{
    @Override
    public void show(int a,int b,int c){
      c=  a*b/2;
      System.out.println(c);
    }
}

public class poly {
    public static void main(String[] args) {
        kir a=new kir();
        a.show(3,4,5);
        a.show( 4, 5,9);

    }
}
