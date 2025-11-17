public class trycatch {
    public static void main(String[] args) {
        try{
            int c=10/0;
            System.out.println(c);
        }catch(ArithmeticException e){
System.out.println("exception "+e);

        }finally{
            System.out.println("i ma excute exception are yes or no i am excuted");
        }
    }
}
