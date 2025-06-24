import java.util.*;

class nikhil{
    public  void show(int a,int b){
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
    b=sc.nextInt();
  int c=a+b;
  System.out.println(c);
     }
    
}
class pr extends nikhil{
    public void show(){
        int ab=10;
        int ba=2;
        int ca=ab*ba;
        System.out.println(ca);
    }
}


public class inheri {
    public static void main(String[] args) {
        pr s=new pr();
        s.show(1,1);
        s.show();
    }
}
