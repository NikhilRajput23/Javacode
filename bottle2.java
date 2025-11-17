import java.util.*;
public class bottle2{
    public int bottle(int numb,int nume){
        int full=numb;
        int empty=numb;
        while(empty>=nume){
        empty=empty-nume;
        nume++;
        full++;
        empty++;

    }
    return full;
    }
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int numb=sc.nextInt();
      int nume=sc.nextInt();
      bottle2 vs=new bottle2();
      int a=vs.bottle( numb, nume);
      System.out.println(a);



    }
}