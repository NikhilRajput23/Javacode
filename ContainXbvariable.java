import java.util.Scanner;

public class ContainXbvariable{
    public int max(String []op){
    int x=0;
    for(String po:op){
        if(po.contains("+")){
            x++;
        }
        else{
            x--;
        }
    }
    return x;
    }
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
           sc.nextLine();

        String[] op=new String[n];
        for(int i=0;i<n;i++){
   op[i]=sc.nextLine();
        }

        ContainXbvariable vs=new ContainXbvariable();
        int  a=vs.max(op);
        System.out.println(a);

    }
}
