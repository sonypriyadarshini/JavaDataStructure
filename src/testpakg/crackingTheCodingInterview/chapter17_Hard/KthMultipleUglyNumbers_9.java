package testpakg.crackingTheCodingInterview.chapter17_Hard;

/*
https://www.geeksforgeeks.org/ugly-numbers/
https://sites.google.com/site/csharpofjameschen/home/math/find-the-kth-number-such-that-the-only-prime-factors-are-3-5-and-7

 */
public class KthMultipleUglyNumbers_9 {

    public static void main(String[] args) {
        System.out.println(findKthUglyNumber(6));
    }

    static int findKthUglyNumber(int n){
        int x3=3, x5=5, x7=7;
        int res[]=new int[n+1];
        res[0]=1;
        int val=0;
        for(int i=1;i<n+1;i++){
         val=Math.min(Math.min(x3,x5),x7);
        res[i]=val;

        if(val==x3)
            x3=x3+3;
        else if(val%5==0)
            x5=x5+5;
        else if(val%7==0)
            x7=x7+7;
        }

        return res[n];

    }

    static int getNthUglyNo(int n)
    {
        int ugly[] = new int[n];  // To store ugly numbers
        int i2 = 0, i3 = 0, i5 = 0;
        int next_multiple_of_2 = 2;
        int next_multiple_of_3 = 3;
        int next_multiple_of_5 = 5;
        int next_ugly_no = 1;

        ugly[0] = 1;

        for(int i = 1; i < n; i++)
        {
            next_ugly_no = Math.min(next_multiple_of_2,
                    Math.min(next_multiple_of_3,
                            next_multiple_of_5));

            ugly[i] = next_ugly_no;
            if (next_ugly_no == next_multiple_of_2)
            {
                i2 = i2+1;
                next_multiple_of_2 = ugly[i2]*2;
            }
            if (next_ugly_no == next_multiple_of_3)
            {
                i3 = i3+1;
                next_multiple_of_3 = ugly[i3]*3;
            }
            if (next_ugly_no == next_multiple_of_5)
            {
                i5 = i5+1;
                next_multiple_of_5 = ugly[i5]*5;
            }
        } /*End of for loop (i=1; i<n; i++) */
        return next_ugly_no;
    }
}
