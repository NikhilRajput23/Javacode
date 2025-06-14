class  Mynik1 extends Thread{
   
    public void run(){
       int a=0;
        while(a<1200){
System.out.println("Thank you is important ");
       a++;
     }
    }


}
class mynik2 extends Thread{
public void run(){
    while(true){
        System.out.println("Thank you Dost");
      
    }
}
}
public class threa_tryblock{
    public static void main(String[] args) {
        Mynik1 t1=new Mynik1(); 
                mynik2 t2=new mynik2(); 
t1.start();
try{
    t1.join();
}
catch(Exception e){
    System.out.println(e);
}
t2.start();

    }


}
