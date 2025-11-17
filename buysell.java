import java.util.Scanner;
public class buysell {
public int maxProfit(int [] price){
    int maxProfit=0;
       for(int i=0;i<price.length;i++){
        for(int j=i+1;j<price.length;j++){
            int profit = price[j]-price[i];
            if(profit >maxProfit ){
                maxProfit =profit;


            }
        }
       }
       return maxProfit;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] price=new int[a];
        System.out.println("price of sell");
        for (int i = 0; i < a; i++) {
            price[i] = sc.nextInt();
        }

        buysell obj = new buysell();
        int result = obj.maxProfit(price);

        System.out.println(+ result);
    }
}

       
    

