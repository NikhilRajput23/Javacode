public class stringbulider {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Nikhil");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'A');
        System.out.println(sb);
        sb.insert(0, 'R');
        System.out.println(sb);
        sb.delete(0, 2);
        System.out.println(sb);
                StringBuilder s=new StringBuilder("h");
                s.append('e');
                 s.append('l');
                  s.append('l');
                   s.append('o');
                   System.out.println(s);

            StringBuilder n=new StringBuilder("nikhil");
            for(int i=0;i<n.length()/2;i++){
                int front=i;
                int back=n.length()-1-i;
                char frontback=n.charAt(front);
                char backchar=n.charAt(back);
                n.setCharAt(front, backchar);
                n.setCharAt(back,frontback);
                
            }
            System.out.println(n);


    }
}
