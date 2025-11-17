
class  Mynik extends Thread{
    public Mynik(String name){  
        super(name);
    }
    public void run(){
        int a=0;
        while(a<=20){
System.out.println(getName()+ a);
        a++;
     }
    }

}

public class priority {
    public static void main(String[] args) {
                Mynik b1=new Mynik("Nikhl Rajput joyjoyjoyjoyujoukohjijojhojij");
                Mynik b2=new Mynik("Nikhil Rajput is important");
                                 Mynik b3=new Mynik("Nikhilt Rajput");
                                 b2.setPriority(Thread.MAX_PRIORITY);
                                 b1.setPriority(Thread.MIN_PRIORITY);
                                 b1.start();
                                 b2.start();
                                 b3.start();

    }
}