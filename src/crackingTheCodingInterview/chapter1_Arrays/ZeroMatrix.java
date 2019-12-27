package crackingTheCodingInterview.chapter1_Arrays;

/*
1.8 Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0.

https://leetcode.com/problems/set-matrix-zeroes/discuss/437220/Java-Easy-Solution-100
 */

public class ZeroMatrix {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 0, 4 },
                { 5, 6, 7, 8 },
                { 0, 3, 3, 3 },
                { 3, 3, 3, 4 } };
        updateMatrix(arr);

    }

    static void updateMatrix(int mat[][]){
        int col[]=new int[mat.length];
        int row[]=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    col[j]=1;
                    row[i]=1;
                }
            }
        }

        //update rows to 0
        for(int i=0;i<mat.length;i++){
            if(row[i]==1)
            {
                for(int j=0;j<mat[i].length;j++)
                    mat[i][j]=0;
            }
        }

        //update cols to 0
        for(int i=0;i<mat.length;i++){
            if(col[i]==1)
            {
                for(int j=0;j<mat.length;j++)
                    mat[j][i]=0;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println("");
        }
    }
}
