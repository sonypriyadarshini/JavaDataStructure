package testpakg.crackingTheCodingInterview.chapter17_Hard;

/*
The Masseuse: A popular masseuse receives a sequence of back-to-back appointment requests and is debating which ones to accept.
She needs a 15-minute break between appointments and therefore she cannot accept any adjacent requests.
Given a sequence of back-to-back appoint- ment requests (all multiples of 15 minutes, none overlap, and none can be moved),
find the optimal (highest total booked minutes) set the masseuse can honor. Return the number of minutes.
EXAMPLE
Input; {30, 15, 60, 75, 45, 15, 15, 45}
Output: 180 minutes ({30, 60, 45, 45}).

https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2017.%20Hard/Q17_16_The_Masseuse/QuestionA.java
 */
public class Masseuse_16 {

    public static void main(String[] args) {

        int[] massages = {30, 15, 60, 75, 45, 15, 15, 45};
//        System.out.println(maxMinutes(massages,0));

        int k=2;
        int x = Integer.parseInt("0010010010", 2);
        System.out.println(1<<1);
        System.out.println(~(1<<1));
            System.out.println(x & ~(1 << 1));
        }

    static int maxMinutes(int a[], int start){
        if(start>=a.length)
            return 0;

        int bestWith=0, bestWithout=0;

        bestWith=a[start]+maxMinutes(a,start+2);
        bestWithout=maxMinutes(a,start+1);
        return Math.max(bestWith,bestWithout);
    }
}
