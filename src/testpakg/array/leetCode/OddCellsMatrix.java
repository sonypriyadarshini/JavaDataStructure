package testpakg.array.leetCode;

public class OddCellsMatrix {

    public static void main(String[] args) {

        System.out.println(oddCells(2,3,new int[][]{{0,1},{1,1}}));
    }

    public static int oddCells(int n, int m, int[][] indices) {
        int res=0;
        int matrix[][]=new int[n][m];
        for(int i=0;i<indices.length;i++){
            int row=indices[i][0];
            int col=indices[i][1];
            for(int x=0;x<m;x++)
                matrix[row][x]++;
            for(int x=0;x<n;x++)
                matrix[x][col]++;

        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(matrix[i][j]);
                if(matrix[i][j]%2!=0)
                    res++;
            }
        }
        return res;

    }
}
