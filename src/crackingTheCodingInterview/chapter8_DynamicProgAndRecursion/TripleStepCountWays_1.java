package crackingTheCodingInterview.chapter8_DynamicProgAndRecursion;
/*

https://www.geeksforgeeks.org/count-ways-reach-nth-stair-using-step-1-2-3/

Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time,
implement a method to count how many possible ways the child can run up the stairs.

 */

public class TripleStepCountWays_1 {

    public static void main(String[] args) {
        System.out.println(countWays(4));
    }

    static int countWays(int n){
        int res[]=new int[n+1];
        res[0]=1;
        res[1]=1;
        res[2]=2;

        for(int i=3;i<=n;i++){
            res[i]=res[i-1]+res[i-2]+res[i-3];
        }
        return res[n];
    }
}
