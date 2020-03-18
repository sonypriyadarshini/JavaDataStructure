package array.dynamicProgramming;
/*
Given two strings str1 and str2 and below operations that can be performed on str1.
Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.

Insert
Remove
Replace
All of the above operations are of equal cost.

https://www.youtube.com/watch?v=b6AGUjqIPsA
 */

public class    EditDistance {

    public static void main(String args[]){

        String str1 = "sunday";
        String str2 = "saturday";
        editDist(str1,str2);
    }
    public static void editDist(String str1, String str2){

        int l1=str1.length(), l2=str2.length();
        int dp[][]=new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++)
            for(int j=0;j<=l2;j++){
                if(i==0&&j==0)
                    dp[i][j]=0;
                else if(i==0)
                    dp[i][j]=dp[i][j-1]+1;
                else if(j==0)
                    dp[i][j]=dp[i-1][j]+1;
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j-1],dp[i][j-1]),dp[i-1][j]);
            }
        System.out.println(dp[l1][l2]);
    }
}
