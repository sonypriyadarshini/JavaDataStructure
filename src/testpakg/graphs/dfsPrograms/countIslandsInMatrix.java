package testpakg.graphs.dfsPrograms;

//https://www.geeksforgeeks.org/find-number-of-islands/

public class  countIslandsInMatrix {
    static int vert;

    public static void main(String[] args) {
        int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1 } };
        vert=5;
        System.out.println(countIslands(M,vert));
    }

    static int countIslands(int M[][],int vertices){
        boolean visited[][]=new boolean[vertices][vertices];
        int c=0;
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                if(M[i][j]==1 && visited[i][j]!=true ){
                    countIslandsHelper(M,i,j,visited);
                    c++;
                }
            }
        }
        return c;
    }

    static void countIslandsHelper(int M[][],int row,int col,boolean visited[][]){
        visited[row][col]=true;
        int rown[]={ -1, -1, -1, 0, 0, 1, 1, 1};
        int coln[]={-1, 0, 1, -1, 1, -1, 0, 1};
        for(int i=0;i<rown.length;i++)
        {
                if(isSafe(M,row+rown[i],col+coln[i],visited))
                    countIslandsHelper(M,row+rown[i],col+coln[i],visited);
            }
    }

    static boolean isSafe(int M[][], int row, int col,
                   boolean visited[][])
    {
        // row number is in range, column number is in range
        // and value is 1 and not yet visited
        return (row >= 0) && (row < vert) && (col >= 0) && (col < vert) && (M[row][col] == 1 && !visited[row][col]);
    }
}
