package crackingTheCodingInterview.chapter8_DynamicProgAndRecursion;

/*
Paint Fill: Implement the "paint fill"function that one might see on many image editing programs. That is, given a screen
 (represented by a two-dimensional array of colors), a point, and a new color,
 fill in the surrounding area until the color changes from the original cofor.

 https://www.geeksforgeeks.org/flood-fill-algorithm-implement-fill-paint/
 */
public class PaintFill_10 {

    static int M=8,N=8;

    public static void main(String[] args)
    {
        int screen[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };
        int x = 4, y = 4, newC = 3;
        paintFill(screen, x, y, newC);

        System.out.println("Updated screen after call to floodFill: ");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(screen[i][j] + " ");
            System.out.println();
        }
    }

    static void paintFill(int s[][], int x,int y, int newC){
        int prevC=s[x][y];
         paintFillHelper(s, x, y, newC,prevC);
    }

    static void paintFillHelper(int s[][], int x,int y, int newC,int prevC){

        if(x<0||x>=M || y<0||y>=N)
            return;
        if(prevC!=s[x][y])
            return;

        s[x][y]=newC;
        paintFillHelper(s,x+1,y,newC,prevC);
        paintFillHelper(s,x-1,y,newC,prevC);
        paintFillHelper(s,x,y+1,newC,prevC);
        paintFillHelper(s,x,y-1,newC,prevC);

    }


}
