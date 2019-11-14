package array.leetCode;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/reconstruct-a-2-row-binary-matrix/

Given the following details of a matrix with n columns and 2 rows :

The matrix is a binary matrix, which means each element in the matrix can be 0 or 1.
The sum of elements of the 0-th(upper) row is given as upper.
The sum of elements of the 1-st(lower) row is given as lower.
The sum of elements in the i-th column(0-indexed) is colsum[i], where colsum is given as an integer array with length n.
Your task is to reconstruct the matrix with upper, lower and colsum.

Return it as a 2-D integer array.

If there are more than one valid solution, any of them will be accepted.

If no valid solution exists, return an empty 2-D array


Input: upper = 2, lower = 1, colsum = [1,1,1]
Output: [[1,1,0],[0,0,1]]
Explanation: [[1,0,1],[0,1,0]], and [[0,1,1],[1,0,0]] are also correct answers.

 */

public class ReconstructMatrix2D {

    public static void main(String[] args) {

        List<List<Integer>> res= reconstructMatrix(2,1,new int[]{1,1,1});
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }

    public static List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> res = new ArrayList<>();

        int n=colsum.length;
        int upperRes[]=new int[n];
        int lowerRes[]=new int[n];
        int i=0;
        for( i=0;i<n;i++){
            if(colsum[i]==2){
                if(upper==0||lower==0)
                    return res;
                upperRes[i]++;
                lowerRes[i]++;
                upper--;
                lower--;
            }
        }
        for(i=0;i<n;i++){

            if(upper==0)
                break;
            if(colsum[i]==1){
                upperRes[i]++;
                lowerRes[i]=0;
                upper--;
            }
        }
        for(i=i;i<n;i++){
            if(colsum[i]==1){
                if(lower==0)
                    return res;
                lowerRes[i]++;
                lower--;
            }
        }

        if(lower>0||upper>0)
            return res;

        List<Integer> upperList = new ArrayList<>();
        List<Integer> lowerList = new ArrayList<>();
        for( i = 0; i < n; i++) {
            upperList.add(upperRes[i]);
            lowerList.add(lowerRes[i]);
        }
        res.add(upperList);
        res.add(lowerList);
        return res;
    }
}
