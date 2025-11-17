import java.util.Scanner;

class nikhi{
  private String name;
  private  int age;
   public String getNa(){
       return name;
   }
   public int geti(){
    return age;

   }
   public void setNa(String name){
    this.name=name;
   }
   
   public void seti(int age){
    if(age>=18){
        this.age=age;
    }
    
   }
   

}


public class encap {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    nikhi c=new nikhi();
    String name=sc.nextLine();
      c.setNa(name);
      int age=sc.nextInt();
      c.seti(age);
      System.out.println(c.length(name)+ c.getNa());
            System.out.println(c.geti());

}
}
