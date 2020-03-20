package testpakg.array.dynamicProgramming;

public class ShortestCommonSubsequence {
    public static void main(String args[]){

        lengthOfCommonSubstring("GXTXAYB","AGGTAB");
    }


    public static void lengthOfCommonSubstring(String a, String b){
        int m =a.length(), n=b.length();
        int L[][] = new int[m+1][n+1];

        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0)
                    L[i][j] = j;
                else if(j==0)
                    L[i][j]=i;
                else if (a.charAt(i-1) == b.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = 1+Math.min(L[i-1][j], L[i][j-1]);
            }
        }
        System.out.println("Length of shortest supersequence is "+L[m][n]);

    }
}
