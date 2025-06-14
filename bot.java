class A{
    A(){
        System.out.println("Tcs");
    }
}
class B extends A{
    B(){
        System.out.println("Wipro");
    }
}
public class bot{
    public static void main(String[] args) {
        B b=new B();
    }
}