package testpakg.array.dynamicProgramming;

//AMAZON INTERVIEW QUESTION

/*
The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence
such that all elements of the subsequence are sorted in increasing order.
For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.
*/

public class LongestIncreasingSubsequence {

    public static void main(String args[]){
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        longestSequenceDP(arr);
    }

    //Complexity: O(n^2)
    public static void longestSequenceDP(int arr[]){
        int n = arr.length,max=0;

        int res[]=new int[n];

        for ( int i = 0; i < n; i++ )
            res[i] = 1;

        for(int i=1;i<n;i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && res[i] < res[j] + 1)
                    res[i] = res[j] + 1;
            }
        }
        for(int i=0;i<n;i++){
            if(max<res[i])
                max=res[i];
        }
        System.out.println(max);
    }

    //Complexity: O(nlongN)
    public static void longestSequenceOptimized(int arr[]){

    }
}
