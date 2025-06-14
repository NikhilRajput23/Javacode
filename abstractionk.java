abstract class car {
    abstract void drive();
    public   void met(){
System.out.println("Diesel");
    }
}
class ford extends car{
    public void drive(){
  System.out.println("Nikhil");
}
}

public class abstractionk {
    public static void main(String[] args) {
        ford f = new ford();
               f.drive();

        f.met();
    }
}
