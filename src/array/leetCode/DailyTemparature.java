package array.leetCode;

/*
Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].

Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].

https://leetcode.com/problems/daily-temperatures/
 */

public class DailyTemparature {

    public static void main(String[] args) {

        int res[]=dailyTemperatures(new int[]{84,84,48,84,48,84,84,84});
        for(int j=0;j<res.length;j++){
            System.out.println("res  "+res[j]);
        }

    }


    public static int[] dailyTemperatures(int[] T) {
        int j=0,count=0,i,count2=0;
        int res[]=new int[T.length];
        for( i=0;i<T.length-1;i++){
//            System.out.println("inside for");

            j=i+1;
            count=0;
            while(j<T.length){
//                System.out.println("inside while");
                if(T[j]>T[i]){
//                    System.out.println("inside if");

                    res[i]=count+1;
                    count2++;
                    break;
                }
                count++;
                j++;
            }
//            System.out.println("break");
            if(count2==0)
            res[i]=0;
        }
//        System.out.println("outside for");
        res[i]=0;
        return res;
    }
}
