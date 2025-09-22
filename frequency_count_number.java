import java.util.*;
public class frequency_count_number {
    public int frequency(int[] num){
        int [] frq=new int[101];
        for(int nums:num){
            //frequency count kele
            frq[nums]++;
        }
        int max=0;int result=0; // check maximum freq of code
        for(int i=0;i<=100;i++){
            if(frq[i]>max){
                max=frq[i];
            }
        }
        // elemnt max frequency che sum
        for(int i=0;i<=100;i++){
            if(frq[i]==max){
                result+=max;
            }
        }
        

        return result;

    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []num=new int[n];
    System.out.println("Enter a array");
    for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
    }
 frequency_count_number freq=new frequency_count_number();
   int a=freq.frequency(num);
    System.out.println(a);
  }
}
