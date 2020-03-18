package array.dynamicProgramming;

//Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.

/*
Input : X = “abcdxyz”, y = “xyzabcd”
Output : 4
The longest common substring is “abcd” and is of length 4.
https://www.youtube.com/watch?v=aVFWW3pBQFo
*/

public class LongestCommonSubsequence {
    public static void main(String args[]){

        lengthOfCommonSubstring("GXTXAYB","AGGTAB");
    }

    public static void lengthOfCommonSubstring(String a, String b){
        int m =a.length(), n=b.length();
        int L[][] = new int[m+1][n+1];

    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (a.charAt(i-1) == b.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
        System.out.println("Length of longest Common subsequence is "+L[m][n]);

    }
}
