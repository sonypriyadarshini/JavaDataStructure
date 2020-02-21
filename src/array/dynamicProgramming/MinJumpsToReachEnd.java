package array.dynamicProgramming;

// Minimum number of jumps to reach end

/*
Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3 (1-> 3 -> 8 ->9)
First element is 1, so can only go to 3. Second element is 3, so can make at most 3 steps eg to 5 or 8 or 9.

//https://www.youtube.com/watch?v=jH_5ypQggWg
*/

public class MinJumpsToReachEnd {

    public static void main(String args[]) {

        int arr[] = {1, 3, 6, 1, 0, 9};
        calcMinJumpMethod1(arr,arr.length) ;
        calcMinJumpMethod2(arr);
    }

    // O(n*n) complexity
    public static void calcMinJumpMethod1(int arr[], int n){
        int jumps[] = new int[n];
        int i, j;

        if (n == 0 || arr[0] == 0){
            System.out.println(Integer.MAX_VALUE);
            return;
        }

        jumps[0] = 0;

        // Find the minimum number of jumps to reach arr[i]
        // from arr[0], and assign this value to jumps[i]
        for (i = 1; i < n; i++)
        {
            jumps[i] = Integer.MAX_VALUE;
            for (j = 0; j < i; j++)
            {
                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE)
                {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        System.out.println(jumps[n-1]);
    }

    // O(n) complexity
    public static void calcMinJumpMethod2(int arr[]){

        if (arr.length <= 1)
            return ;

        // Return -1 if not possible to jump
        if (arr[0] == 0)
            return ;

        // initialization
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        // Start traversing array
        for (int i = 1; i < arr.length; i++)
        {
            // Check if we have reached the end of the array
            if (i == arr.length - 1)
                System.out.println(jump);

            // updating maxReach
            maxReach = Math.max(maxReach, i+arr[i]);

            // we use a step to get to the current index
            step--;

            // If no further steps left
            if (step == 0)
            {
                //  we must have used a jump
                jump++;

                //Check if the current index/position  or lesser index
                // is the maximum reach point from the previous indexes
                if(i>=maxReach)
                    return;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                step = maxReach - i;
            }
        }
    }
}
