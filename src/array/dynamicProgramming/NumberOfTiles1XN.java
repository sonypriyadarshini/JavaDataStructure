package array.dynamicProgramming;

//AMAZON INTERVIEW QUESTION

//Given a “2 x n” board and tiles of size “2 x 1”, count the number of ways to tile the given board using the 2 x 1 tiles.
//A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.

public class NumberOfTiles1XN {

    public static void main(String args[]){
        countTiles4Xn(5);
        countTiles2Xn(3);
    }

    public static void countTiles4Xn(int n){

        int[] res = new int[n+1];
        res[0] = 0;
        for(int i=1;i<=n;i++)
        {
            if (i >= 1 && i <= 3)
                res[i]=1;
            else if(i==4)
                res[i]=2;
            else
                res[i]=res[i-1]+res[i-4];
        }
        System.out.println("No of ways a grid og 4 X n("+n+") can be filled with 4X1 tiles is : "+res[n]);
    }

    public static void countTiles2Xn(int n){

        int[] res = new int[n+1];
        res[0] = 0;
        res[1]=1;
        res[2]=2;
        for(int i=3;i<=n;i++)
        {
            res[i]=res[i-1]+res[i-2];
        }
        System.out.println("No of ways a grid og 2 X n("+n+") can be filled with 2X1 tiles is : "+res[n]);
    }
}
