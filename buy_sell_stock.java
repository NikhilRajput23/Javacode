import java.util.Scanner;

public class buy_sell_stock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] prices=new int[n];
         for(int i=0;i<n;i++){
          prices[i]=sc.nextInt();
         }
          int minprice=Integer.MAX_VALUE;
          int max=0;
          for(int price:prices){
            if(price<minprice){
                minprice=price;

            }else if(price-minprice>max){
                max=price-minprice;
            }
          }     
 System.out.println(max);
    }
}

