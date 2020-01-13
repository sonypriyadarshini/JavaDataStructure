package crackingTheCodingInterview.chapter8_DynamicProgAndRecursion;

public class CoinChangeNoOfWays_11 {
    public static void main(String[] args) {
        System.out.println(coinChangeWays(new int[]{3,2,6}, 6));
    }

    static int coinChangeWays(int coins[], int amount ){
        int n = coins.length;
        int res[][]= new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            res[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(j<coins[i-1])
                    res[i][j]=res[i-1][j];
                else
                    res[i][j]=res[i-1][j] + res[i][j-coins[i-1]];

            }
        }
        return res[n][amount];
    }
}
