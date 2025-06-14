class MynikRunnable implements Runnable{
    public void run(){
            System.out.println("runnable thread name ");
     }
     
    }


class  Mynik extends Thread{
    public Mynik(String name){  
        super(name);
    }
    public void run(){
        int a=34;
        System.out.println("NIKHIL one ");
// for(int i=10;i>a;i++){
//         System.out.println(" Nikhil Rajput");

//       }
    }

}

public class newjava_thread {
    public static void main(String[] args) {
                Thread t1 = new Thread(new MynikRunnable(), "RunnableThread");
                t1.start();

        Mynik b=new Mynik("Singh");
                Mynik b1=new Mynik("NIKHIL RAJPUT");
                                                System.out.println(" the id is : " + b1.getId());


        b.start();
                System.out.println(" the id is : " + b.getId());
                                System.out.println(" the id is : " + b.getName());
                                                System.out.println(" the id is : " + b.getClass());
                                                                                System.out.println(" the id is : " + b1.getName());




    }
}
