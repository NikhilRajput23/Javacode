import java.util.*;
public class bottle2_use2aproach{
    public int bottlenum(int numb,int nume){
        int full=numb;
        int empty=numb;
        while(empty>=nume){
            int newbottle=empty/nume;
            full+=newbottle;
            empty=newbottle+(empty%nume);
           nume++;

        }
        return full;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numb=sc.nextInt();
                int nume=sc.nextInt();
                bottle2_use2aproach vs=new bottle2_use2aproach();
                int a=vs.bottlenum(numb,nume);
            System.out.println(a);

    }
}