package array.dynamicProgramming;

public class CoinChangeProblem {

    public static void main (String args[])
    {
        int set[] = { 3,5};
        int sum = 6;
        int n = set.length;
        isSubsetSum(set, n, sum);
    }

    static void isSubsetSum(int set[],
                            int n, int sum)
    {
        int subset[][] = new int[n+1][sum+1];

        for (int i = 0; i <= n; i++) {
            subset[i][0] = 1;
        }

        for (int i = 1; i <=n; i++)
        {
            for (int j = 1; j <=sum; j++)
            {
                if(set[i-1]>j)
                    subset[i][j] = subset[i-1][j];
                else
                    subset[i][j] = subset[i-1][j] + subset[i][j-set[i-1]];
            }
        }

        // print the table
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <= sum; j++)
                System.out.print ("  "+subset[i][j]);
            System.out.println(" ");
        }
        System.out.println ("No of possible ways ? "+subset[n][sum]);
    }
}
