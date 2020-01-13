package crackingTheCodingInterview.chapter16_MediumLevelPrograms;

/*
https://www.geeksforgeeks.org/smallest-difference-pair-values-two-unsorted-arrays/

 */

import java.util.Arrays;

public class SmallestDiffPair_6 {

    public static void main(String[] args) {
        // Input given array A
        int A[] = {10, 5, 40};

        // Input given array B
        int B[] = {50, 90, 80};
        System.out.println(findSmallestDifference(A,B));
    }

    static int findSmallestDifference(int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);

        int al=a.length;
        int bl=b.length;
        int ax=0,bx=0;
        int res=Integer.MAX_VALUE;
        while(ax<al && bx<bl){
            if(res>Math.abs(a[ax]-b[bx]))
                res=Math.abs(a[ax]-b[bx]);
            else if(a[ax]>b[bx])
                bx++;
            else
                ax++;

        }
        return res;
    }
}
