interface  car{
    public void petrol();
    public void brand();
    public void topspeed();
    
} 
class tata implements car{
public void petrol(){
System.out.println("jio");

}
public void brand(){
    System.out.println("Ford");
}
public void topspeed(){
    System.out.println("540");
}
}
class jaguar extends tata{
     public void company(){
        System.out.println(" sir ratan tata company");
     }
}




public class imp {
    public static void main(String[] args) {
    g a=new g();
        a.nik();
        a.company());
    }
}
