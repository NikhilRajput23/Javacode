public class myclass{
      int a;
      String name="nikhil";
        int b;

      public  int logic(){
       int c=a+b;
          System.out.println(c);
          return c;

    }
    public static void main(String[] args) {
        myclass c=new myclass();
        c.a=10;
        c.b=9;
        c.logic();
        
    }
}