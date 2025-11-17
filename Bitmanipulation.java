public class Bitmanipulation {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        // if((bitmask & n)==0){
        //     System.out.println("Bit was Zero");

        // }else{
        //     System.out.println("Bit was One");
        // }
        // int new_num=bitmask | n;
        // System.out.println(new_num);
        int notbit=~(bitmask);
        int newnum=notbit &n;
        System.out.println(newnum);

    }
}
