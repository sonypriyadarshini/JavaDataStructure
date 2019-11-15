package array.leetCode;
/*
https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion/submissions/

Input: arr = [1,-2,-2,3]
Output: 3
Explanation: We just choose [3] and it's the maximum sum.

 */

public class LargestSumContiguousSubarrayWith1Deletion {
    public static void main(String args[]){
        int arr[]={2,3,-7,-3,10,1};

        System.out.println(maximumSum(arr));
    }
    public static int maximumSum(int[] arr) {
        int sumWithSkip=arr[0], sumWithoutSkip=arr[0], finalSum=arr[0];
        for(int i=1;i<arr.length;i++){

            sumWithoutSkip=Math.max(sumWithSkip,sumWithoutSkip+arr[i]);
            sumWithSkip=Math.max(sumWithSkip+arr[i],arr[i]);
            finalSum=Math.max(finalSum,Math.max(sumWithoutSkip,sumWithSkip));

        }
        return finalSum;
    }
}
