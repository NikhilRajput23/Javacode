import java.util.*;
public class stringrotate{
  public boolean lo(String s,String goal){
    if(s.length()==goal.length()&& (s+s).contains(goal)){
      return true;
    }
    return false;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
        String goal=sc.nextLine();
         stringrotate vs=new stringrotate();
         boolean a=vs.lo(s,goal);
      System.out.println(a);
  }
}