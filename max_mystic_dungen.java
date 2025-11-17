import java.util.*;
public class max_mystic_dungen{
    public  static int maximum(int []energy,int k){
        int n=energy.length;
        int a=Integer.MIN_VALUE;
        for(int i=n-k;i<n;i++){
                    int sum=0;

            for(int j=i;j>=0;j-=k){
                sum=sum+energy[j];
                a=Math.max(a, sum);

            }
            
        }
        return a;

    }
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []energy=new int[n];
for(int i=0;i<energy.length;i++){
energy[i]=sc.nextInt();
}
int k=sc.nextInt();
int vs=max_mystic_dungen.maximum(energy, k);
System.out.println(vs);
    }
}