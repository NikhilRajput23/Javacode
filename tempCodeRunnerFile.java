import java.util.*;
public class spells_potion {
    public static int[] max(int[]spell,int[]position,long su){
        int n=spell.length;
        int m=position.length;
        int [] re=new int[n];
        for(int i=0;i<n;i++){
            int s=spell[i];
         int left=0;
         int right=m-1;
         while(left<=right){
            int mid=(left+right)/2;
            long p= (long)position[mid]*su;
if(p>su){
    right=mid-1;

}else{
    left=left+1;

}


         }
         re[i]=m-left;
        }
            return re;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int spell=sc.nextInt();
        int []arr=new int[spell];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int position=sc.nextInt();

        int []arr1=new int[position];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        long su=sc.nextLong();
        int ans=spells_potion.max(spell, position, su);
 System.out.println(ans);
     
        
    }
}
