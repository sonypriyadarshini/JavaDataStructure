package array.leetCode;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/

Given an integer array arr and an integer difference, return the length of the longest subsequence in arr which is an
arithmetic sequence such that the difference between adjacent elements in the subsequence equals difference.

Input: arr = [1,5,7,8,5,3,4,2,1], difference = -2
Output: 4
Explanation: The longest arithmetic subsequence is [7,5,3,1].
 */

public class LongestSubsequenceWithDifference {
    public static void main(String[] args) {
       System.out.println( longestSubsequence(new int[]{1,2,3,4},1));
    }

    // Order: O(n)
    public static int longestSubsequence(int[] arr, int difference) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int a : arr) {
            if(mp.containsKey(a-difference)) {
                mp.put(a, mp.get(a-difference)+1);
            }else {
                mp.put(a, 1);
            }
        }
        int ret = 1;
        for(Map.Entry <Integer, Integer> e : mp.entrySet()) {
            ret = Math.max(ret, e.getValue());
        }
        return ret;
    }

    // Order: O(n2)
    public static int longestSubsequenceIterative(int[] arr, int difference) {
        int n=arr.length,j=0,count=1,maxCount=1;
        for(int i=0;i<n;i++){
            j=i+1;
            int k=arr[i];
            while(j<n){
                if(k+difference==arr[j]){
                    count++;

                    System.out.println("count"+count);
                    System.out.println(k+" : "+arr[j]);
                    k=arr[j];
                }
                    j++;

            }
            maxCount=Math.max(maxCount,count);
            count=1;

        }
        return maxCount;
    }
}
