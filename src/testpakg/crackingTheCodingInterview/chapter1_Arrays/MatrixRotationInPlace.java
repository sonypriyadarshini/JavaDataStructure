package testpakg.crackingTheCodingInterview.chapter1_Arrays;
/*
1.7 Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?


 */
public class MatrixRotationInPlace {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        rotateMatrix(arr);
    }

    static void rotateMatrix(int mat[][]){

        //transpose
        for(int i=0;i<mat.length-1;i++){
            for(int j=i+1;j<mat[0].length;j++){
                int temp=mat[j][i];
                mat[j][i]=mat[i][j];
                mat[i][j]=temp;
            }
        }

        //print matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println("");
        }

        //reverse columns
        for(int i=0;i<mat[0].length;i++){

            int k=mat[0].length-1;

            for(int j=0;j<k;j++){
                int temp=mat[j][i];
                mat[j][i]=mat[k][i];
                mat[k][i]=temp;
                k--;
            }
        }

        //print matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println("");
        }
    }
}
