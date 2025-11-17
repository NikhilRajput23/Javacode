import java.util.*;
public class array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int [] mark=new int [a];
        
      for(int i=0;i<mark.length;i++) {
    	  mark[i]=sc.nextInt();
      }
      int x=sc.nextInt();
      for(int i=0;i<mark.length;i++) {
    	  if(mark[i]==x) {
    		  System.out.println("X found at " + i);
    	  }
    	
    	  
      }
	}

}
