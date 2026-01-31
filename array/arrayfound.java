import java.util.Scanner;

public class arrayfound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ket=sc.nextInt();
        boolean found=false;
        for(int a:arr){
            if(a==ket){
            found=true;
            break;
        
            }
        }
System.out.println(found ? "Found" : "Not Found");
    }
}
