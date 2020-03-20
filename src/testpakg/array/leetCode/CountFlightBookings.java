package testpakg.array.leetCode;
/*
There are n flights, and they are labeled from 1 to n.

We have a list of flight bookings.  The i-th booking bookings[i] = [i, j, k] means that we booked k seats from flights labeled i to j inclusive.

Return an testpakg.array answer of length n, representing the number of seats booked on each flight in order of their label.

Input: bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
Output: [10,55,45,25,25]

https://leetcode.com/problems/corporate-flight-bookings/
 */

public class CountFlightBookings {

    public static void main(String[] args) {

        int res[]=corpFlightBookings(new int[][]{{1,2,10},{2,3,20},{2,5,25}}, 5);
        for(int j=0;j<res.length;j++){
            System.out.println("res  "+res[j]);
        }

    }

    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int res[] = new int[n];
        int start, end;
        for (int i = 0; i < bookings.length; i++) {

            start = bookings[i][0];
            end = bookings[i][1];
            while (start <= end) {
                res[start-1] += bookings[i][2];
                start++;
            }
        }

            return res;
        }




}
