public class meracode{
static int sum(int a,int b){
int c;
if(a>b){
    c=a+b;
}
else{
    c=a+b*a;

}
return c;
}
public static void main(String[] args) {
       int x = 5;
       int y = 7;
       int z;
      z =sum(x,y);
      int v=8;
      int w=1;
      int m;
      m=sum(v,w);
      System.out.println(z);
      System.out.println(m);
    }

}