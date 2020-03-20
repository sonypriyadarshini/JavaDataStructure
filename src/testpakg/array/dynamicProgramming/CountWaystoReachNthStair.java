package testpakg.array.dynamicProgramming;

//There are n stairs, a person standing at the bottom wants to reach the top.
//The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
//https://www.geeksforgeeks.org/count-ways-reach-nth-stair-using-step-1-2-3/

public class CountWaystoReachNthStair {
    public static void main(String[] args) {

        countWays(4);
        System.out.println(countWays(4,3));

    }

    // function where m(no of steps that can be taken) is always 3, O(n)
    public static void countWays(int n) {

        int[] res = new int[n + 1];
        if (n <= 1) {
            System.out.println(1);
            return;
        }
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
        for (int i = 3; i <= n; i++)
                res[i] = res[i - 2] + res[i - 1] + res[i-3];
        System.out.println(res[n]);
    }



    //generalized funtion with all kinds of m and n O(nm)
    static int countWays(int s, int m)
    {
        return countWaysUtil(s+1, m);
    }

    static int countWaysUtil(int n, int m)
    {
        int res[] = new int[n];
        res[0] = 1; res[1] = 1;
        for (int i=2; i<n; i++)
        {
            res[i] = 0;
            for (int j=1; j<=m && j<=i; j++)
                res[i] += res[i-j];
        }
        return res[n-1];
    }
}
