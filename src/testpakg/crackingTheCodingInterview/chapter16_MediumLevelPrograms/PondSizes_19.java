package testpakg.crackingTheCodingInterview.chapter16_MediumLevelPrograms;

/*
https://code.sololearn.com/cMd1T960cynN/#java

 */
public class PondSizes_19 {
    static int count=0,visited[][];

    public static void main(String[] args) {
        int a[][]=new int[][]{{6,2,1,0},{8,1,3,6},{1,1,0,1},{0,1,0,1}};
        int r=a.length, c=a[0].length;
        visited=new int[r][c];
        findPondSize(a);
    }

    static void findPondSize(int a[][]){
        int r=a.length, c=a[0].length;
        for (int i = 0; i < r; ++i)
            for (int j = 0; j < c; ++j)
                if (a[i][j]==0 && visited[i][j]==0) {
                    count=1;
                    dfs(a,i,j);
                    System.out.println(count);
                }
    }

    static void dfs(int a[][], int row,int col){
        int rowNbr[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
        int colNbr[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};
        visited[row][col] =1;
        for (int k = 0; k < 8; ++k)
            if (isSafe(a, row + rowNbr[k],col+ colNbr[k])==1)
                dfs(a,row + rowNbr[k], col + colNbr[k]);
    }

    static int isSafe(int a[][], int row, int col)
    {
        int r=a.length;
        int c=a[0].length;
        if((row >= 0) && (row < r) &&(col >= 0) && (col < c) && (a[row][col]==0 && visited[row][col]==0))
        {
            count++;
            return 1;
        }
        return 0;
    }
}
