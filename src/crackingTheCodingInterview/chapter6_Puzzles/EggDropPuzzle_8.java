package crackingTheCodingInterview.chapter6_Puzzles;

/*
https://www.geeksforgeeks.org/egg-dropping-puzzle-dp-11/
https://www.youtube.com/watch?v=o_AJ3VWQMzA
 */
public class EggDropPuzzle_8 {

    public static void main(String[] args) {
        System.out.println(eggDrop(36,2));
    }

    static int eggDrop(int floors, int eggs){

        int res[][]=new int[floors+1][eggs+1];

        //base case1: when there is 1 egg
        for(int i=1;i<=floors;i++)
        {
            res[i][1]=i;
        }

        //base case2: when floor is 1 or 0
        for(int j=1;j<=eggs;j++)
        {
            res[0][j]=0;
            res[1][j]=1;
        }

        for(int i=2;i<=floors;i++){
            for(int j=2;j<=eggs;j++){
                res[i][j]=Integer.MAX_VALUE;
                for(int x=1;x<=i;x++){
                    int temp=1+Math.max(res[i-x][j],res[x-1][j-1]);
                    res[i][j]=Math.min(res[i][j],temp);
                }
            }
        }

        return res[floors][eggs];
    }
}
