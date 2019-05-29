package array.optimization;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

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
