import java.util.*;
public class bottle{
    public int bottlenum(int numb,int nume){
        int full=numb;
        int empty=numb;
        while(empty>=nume){
            int newbottle=empty/nume;
            full+=newbottle;
            empty=newbottle+(empty%nume);

        }
        return full;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numb=sc.nextInt();
                int nume=sc.nextInt();
                bottle vs=new bottle();
                int a=vs.bottlenum(numb,nume);
            System.out.println(a);

    }
}