package array.dynamicProgramming;

/*
In a given array say {3, 2, 1,4}, find if using the given numbers a sum of 6 can be formed or not.
Each element can be used only once,
*/

public class SubsetSum {

    public static void main (String args[])
    {
        int set[] = {3, 2, 1,4};
        int sum = 6;
        int n = set.length;
        isSubsetSum(set, n, sum);
    }

    static void isSubsetSum(int set[],
                               int n, int sum)
    {
        boolean subset[][] =
                new boolean[n+1][sum+1];

        //set the 1st column and row to true
        for (int i = 0; i <= n; i++) {
            subset[i][0] = true;
        }
        for (int j = 1; j <= sum; j++) {
            subset[0][j] = false;
        }

        // Fill the subset table, if set value is > sum, copy from top else, take OR of top + value of (top - set value)
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= sum; j++)
            {
                if(set[i-1]>j)
                subset[i][j] = subset[i-1][j];
                else if (set[i-1]<=j)
                        subset[i][j] = subset[i-1][j] || subset[i - 1][j-set[i-1]];
            }
        }

        // print the table
        for (int i = 0; i <= n; i++)
        {
        for (int j = 0; j <= sum; j++)
            System.out.print ("  "+subset[i][j]);
        System.out.println(" ");
        }
        System.out.println ("Subset found ? "+subset[n][sum]);
    }
}
