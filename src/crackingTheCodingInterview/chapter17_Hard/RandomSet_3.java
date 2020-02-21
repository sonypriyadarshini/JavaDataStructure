package crackingTheCodingInterview.chapter17_Hard;

import java.util.Random;
/*
Random Set: Write a method to randomly generate a set of m integers from an array of size n.
Each element must have equal probability of being chosen.

https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2017.%20Hard/Q17_03_Random_Set/Question.java
 */

public class RandomSet_3 {

    public static void main(String[] args) {
        int[] cards = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int res[]=genertaeRandomSet(cards,5);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);

    }

    static int[] genertaeRandomSet(int a[], int m){

        int res[]=new int[m];
        Random random=new Random();
        for(int i=0;i<m;i++){
            int t=random.nextInt(i+1);
            res[i]=a[t];
        }
        return res;

    }
}
