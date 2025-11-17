    import java.util.*;
    public class spells_potion {
        public static int[] max(int[]spell,int[]position,long su){
            Arrays.sort(position);
            int n=spell.length;
            int m=position.length;
            int [] re=new int[n];
            for(int i=0;i<n;i++){
                int s=spell[i];
            int left=0;
            int right=m-1;
            while(left<=right){
                int mid=(left+right)/2;
                long p= (long)position[mid]*s;
    if(p>=su){
        right=mid-1;

    }else{
        left=mid+1;

    }


            }
            re[i]=m-left;
            }
                return re;

        }
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            int spellc=sc.nextInt();
            int []spell=new int[spellc];
            for(int i=0;i<spell.length;i++){
                spell[i]=sc.nextInt();
            }
            int positionn=sc.nextInt();

            int []position=new int[positionn];
            for(int i=0;i<position.length;i++){
                position[i]=sc.nextInt();
            }
            long su=sc.nextLong();
            int []ans=spells_potion.max(spell, position, su);
    System.out.println(Arrays.toString(ans));
        
            
        }
    }
