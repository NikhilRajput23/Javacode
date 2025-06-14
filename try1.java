    public class try1 {
        public static void main(String[] args) {
            try{
                int a=10;
                int b=2
                ;
                int c;
                c=a/b;
                System.out.println(c);
                String s=null;
                System.out.println(s.length());

            }
            catch(ArithmeticException e){
                System.out.println("Error handle 10 not divde 0"+  e.getMessage());

            }
            catch(NullPointerException e){
                System.out.println("error occur null" +e.getMessage());

            }
            finally{
                System.out.println(" Final block excute");
            }
        }
    }
