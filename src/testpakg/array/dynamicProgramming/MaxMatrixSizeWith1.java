package testpakg.array.dynamicProgramming;

//https://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/
//https://www.youtube.com/watch?v=FO7VXDfS8Gk
//Given a binary matrix, find out the maximum size square sub-matrix with all 1s.

public class MaxMatrixSizeWith1 {

    public static void main(String[] args)
    {
        int M[][] = {{0, 1, 1, 0, 1},
                    {1, 1, 1, 1, 0},
                    {1, 0, 1, 1, 0},
                    {1, 1, 1, 1, 0},
                    {1, 1, 1, 1, 1},
                    {0, 0, 0, 0, 0}};

        printMaxSubSquare(M);
    }

    static void printMaxSubSquare(int M[][]){

        int res[][]=M.clone();
        int resCount=0;
        for(int i=1;i<M.length;i++){
            for(int j=1;j<M[0].length;j++){

                if(res[i][j]>0){
                    res[i][j]=1+Math.min(Math.min(res[i-1][j],res[i][j-1]),res[i-1][j-1]);
                }
                resCount=Math.max(resCount,res[i][j]);
            }
        }
    System.out.println(resCount);
    }

}
