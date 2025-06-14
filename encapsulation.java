class parul{
    private String name="nikhil";
        private int age;
    private int roll;

    public String getNa(){
return name;
    }
    public int geta(){
        return age;
    }
    public   int getro(){
      return roll;
    }
    public void setNa(){
        name=name;
    }
    public void  seta(int age){
        this.age=age;
    }
    public void setro(int roll){
        this.roll=roll;
    }
    
}


public class encapsulation {
    public static void main(String[] args) {
        parul nik=new parul();
        nik.setNa();
                nik.seta(19);
        nik.setro(43535);
  System.out.println(nik.getNa());
  System.out.println(nik.geta());
 System.out.println( nik.getro());
    }

}
