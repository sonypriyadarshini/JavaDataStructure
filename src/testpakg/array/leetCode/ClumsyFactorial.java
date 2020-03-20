package testpakg.array.leetCode;

/*

https://leetcode.com/problems/clumsy-factorial/submissions/

Normally, the factorial of a positive integer n is the product of all positive integers less than or equal to n.  For example, factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1.

We instead make a clumsy factorial: using the integers in decreasing order, we swap out the multiply operations for a fixed rotation of operations: multiply (*), divide (/), add (+) and subtract (-) in this order.

For example, clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1.  However, these operations are still applied using the usual order of operations of arithmetic: we do all multiplication and division steps before any addition or subtraction steps, and multiplication and division steps are processed left to right.

Additionally, the division that we use is floor division such that 10 * 9 / 8 equals 11.  This guarantees the result is an integer.

Implement the clumsy function as defined above: given an integer N, it returns the clumsy factorial of N.

 */

//TODO: DO IT AGAIN!!

public class ClumsyFactorial {

    public static void main(String[] args) {

            System.out.println(clumsy(10));
    }


    public static int clumsy(int N) {
        int res=N;
//        int temp=N, count=1;
//        while(temp>0){
//            int prev=temp-1;
//            if(prev>0){
//                switch(count){
//                    case 1:
//                        res=res*prev;
//                        break;
//                    case 2:
//                        res=res/prev;
//                        break;
//                    case 3:
//                        res=res+prev;
//                        break;
//                    case 4:
//                        res=res-prev;
//                        break;
//
//                }
//                count++;
//            }
//            temp--;
//            if(count>4)
//                count=1;
//        }


        if(N<3)
            return N;
        if(N==3)
            return 6;
        return N*(N-1)/(N-2)+(N-3)+clumsyhelper(N-4);

    }

    public static int clumsyhelper(int N) {
        if(N<3){return -N;}
        if(N==3){return -6;}
        return -N*(N-1)/(N-2)+N-3+clumsyhelper(N-4);
    }
}
