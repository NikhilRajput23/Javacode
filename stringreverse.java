import java.util.*;
public class stringreverse{
    public void sum(char []a){
        int l=0;
        int r=a.length-1;
        while(l<r){
            char temp=a[l];
        a[l]=a[r];
        a[r]=temp;
        l++;
        r--;

        }
    }
    public static void main(String[]args ){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char [] arr=s.toCharArray();
        stringreverse vs=new stringreverse();
        vs.sum(arr);
        String sum1=new String(arr);

        System.out.println(sum1);
    }
}