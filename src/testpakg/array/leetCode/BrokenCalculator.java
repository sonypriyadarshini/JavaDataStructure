package testpakg.array.leetCode;

/*
https://leetcode.com/problems/broken-calculator/

On a broken calculator that has a number showing on its display, we can perform two operations:

Double: Multiply the number on the display by 2, or;
Decrement: Subtract 1 from the number on the display.
Initially, the calculator is displaying the number X.

Return the minimum number of operations needed to display the number Y.

Input: X = 5, Y = 8
Output: 2
Explanation: Use decrement and then double {5 -> 4 -> 8}.
 */

public class BrokenCalculator {

    public static void main(String[] args) {

        System.out.println(brokenCalc(5,8));
    }

    public static int brokenCalc(int X, int Y) {
        if(X>=Y)
            return X-Y;
        int count=0,temp=Y;
        while(temp>X){
            if(temp%2==0){
                temp=temp/2;
                count++;
            }
            else
            {
                temp=(temp+1)/2;
                count=count+2;
            }
        }
        count+=(X-temp);
        return count;
    }
}
