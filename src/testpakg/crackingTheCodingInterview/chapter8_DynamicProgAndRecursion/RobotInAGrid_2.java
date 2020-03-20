package testpakg.crackingTheCodingInterview.chapter8_DynamicProgAndRecursion;

/*
https://leetcode.com/problems/unique-paths-ii/discuss/468893/Java-solution-using-DP

Robot in a Grid: Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
The robot can only move in two directions, right and down, but certain cells are "off limits" such that the robot cannot step on them.
Design an testpakg.algorithm to find a path for the robot from the top left to the bottom right.

 */
public class RobotInAGrid_2 {

    public static void main(String[] args) {

        int grid[][]={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(countUniquePaths(grid));
    }

    static int countUniquePaths(int obstacleGrid[][]){
        int rows = obstacleGrid.length;
        int cols=obstacleGrid[0].length;
        int result[][]=new int[rows][cols];
        if(obstacleGrid[0][0]==0)
            result[0][0]=1;
        for(int i=1;i<rows;i++){
            if(obstacleGrid[i][0]==0 && result[i-1][0]==1)
                result[i][0]=1;
        }
        for(int j=1;j<cols;j++){
            if(obstacleGrid[0][j]==0 && result[0][j-1]==1)
                result[0][j]=1;
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(obstacleGrid[i][j]==0)
                    result[i][j]=result[i-1][j]+result[i][j-1];
            }
        }
        return result[rows-1][cols-1];

    }


    static void findUniquePath(){};
}
