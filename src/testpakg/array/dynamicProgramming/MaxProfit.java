package testpakg.array.dynamicProgramming;

//In a daily share trading, a buyer buys shares in the morning and sells it on same day.
// If the trader is allowed to make at most 2 transactions in a day, where as second transaction can only start after first one is complete (Sell->buy->sell->buy).
// Given stock prices throughout day, find out maximum profit that a share trader could have made.

public class MaxProfit {
    public static void main(String args[])
    {
        int price[] = {2, 30, 15, 10, 8, 25, 80};
        int n = price.length;
        System.out.println("Maximum Profit = "+ maxProfit(price, n));
    }

    public static int maxProfit(int price[],int n){

        int profit[]= new int[n], min_price=0, max_price=0;
        for(int i=0;i<n;i++)
            profit[i]=0;

        max_price=price[n-1];
        for(int i=n-2;i>=0;i--){
            if(max_price<price[i])
                max_price=price[i];

            profit[i] = Math.max(profit[i+1],max_price-price[i]);
        }

        min_price=price[0];
        for(int i=1;i<n;i++){
            if(min_price>price[i])
                min_price=price[i];

            profit[i] = Math.max(profit[i-1],price[i]-min_price + profit[i]);
        }
        return profit[n-1];

    }
}
