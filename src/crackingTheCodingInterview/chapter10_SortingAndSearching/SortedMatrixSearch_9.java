package crackingTheCodingInterview.chapter10_SortingAndSearching;

/*
Sorted Matrix Search: Given an M x N matrix in which each row and each column is sorted in
ascending order, write a method to find an element.

https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2010.%20Sorting%20and%20Searching/Q10_09_Sorted_Matrix_Search/QuestionA.java
 */
public class SortedMatrixSearch_9 {

    public static void main(String[] args) {
        int mat[][] = {{0, 6, 8, 9, 11},
                {20, 22, 28, 29, 31},
                {36, 38, 50, 61, 63},
                {64, 66, 100, 122, 128}};
        sortedMatrixSearch(mat,128);
    }

    static void sortedMatrixSearch(int[][] matrix, int n){
        int row=matrix.length-1;
        int col=matrix[0].length-1;
        int i=0;

        while(i<=row && col>=0)
        {
        if(matrix[i][col]==n){
            System.out.println(i+" , "+col);
            return;
        }
        else if(matrix[i][col]>n){
            col--;
        }
        else if(matrix[i][col]<n){
            i++;
        }
        }
    }
}
