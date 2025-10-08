public class pairsspell{

    public int spee(int [] spell,int []posi,long such){
      int count =0;
      for(int i=0;i<spell.length;i++){
        for(int j=0;j<posi.length;j++){
             if ((long)spell[i] * (long)posi[j] >= such) {  
                count++;
        }}
      }
              return count;

    }
    public static void main(String []args){
int []spell={5,1,3};
int [] posi={1,2,3,4,5};
long such=7;
pairsspell vs=new pairsspell();
System.out.println(vs.spee(spell, posi, such));
        
    }
}
