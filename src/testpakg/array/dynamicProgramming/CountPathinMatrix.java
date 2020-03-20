package testpakg.array.dynamicProgramming;

//Count all possible paths from top left to bottom right of a mXn matrix

//The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints
//that from each cell you can either move only to right or down

// with obstacles: https://leetcode.com/problems/unique-paths-ii/discuss/468893/Java-solution-using-DP
public class CountPathinMatrix {

    public static void main(String args[]){
        countPath(2,2);
    }

    public static void countPath(int m, int n){



        // Create a 2D table to store results
        // of subproblems
        int count[][] = new int[m][n];

        // Count of paths to reach any cell in
        // first column is 1
        for (int i = 0; i < m; i++)
            count[i][0] = 1;

        // Count of paths to reach any cell in
        // first row is 1
        for (int j = 0; j < n; j++)
            count[0][j] = 1;

        // Calculate count of paths for other
        // cells in bottom-up manner using
        // the recursive solution
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++)

                // By uncommenting the last part the
                // code calculatest he total possible paths
                // if the diagonal Movements are allowed
                count[i][j] = count[i - 1][j] + count[i][j - 1]; //+ count[i-1][j-1];
        }
        System.out.println(count[m - 1][n - 1]);
    }
}
