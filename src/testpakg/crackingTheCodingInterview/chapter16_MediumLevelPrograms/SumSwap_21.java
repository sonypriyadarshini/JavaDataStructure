package testpakg.crackingTheCodingInterview.chapter16_MediumLevelPrograms;

import java.util.Arrays;
/*
https://www.geeksforgeeks.org/find-a-pair-swapping-which-makes-sum-of-two-arrays-same/
 */

public class SumSwap_21 {

    public static void main(String[] args) {
        int A[] = { 4, 1, 2, 1, 1, 2 };
        int n = A.length;
        int B[] = { 3, 6, 3, 3 };
        int m = B.length;

        // Call to function
        findSwapValues(A, n, B, m);
    }

    static void findSwapValues(int a[],int n, int b[], int m){
        Arrays.sort(a);
        Arrays.sort(b);
        int sum1=0, sum2=0;
        int x=0,y=0;
         for(int i=0;i<n;i++){
             sum1+=a[i];
         }
        for(int i=0;i<m;i++){
            sum2+=b[i];
        }
        int t = (sum1-sum2)/2;

        while(x<n && y<m){
            if(a[x]-b[y]==t){
                System.out.println(a[x]+" , "+b[y]);
                return;
            }
            else if(a[x]-b[y]<t){
//                if(b[y]>a[x])
//                    y++;
//                else
                    x++;
            }
            else {
//                if(b[y]>a[x])
//                    x++;
//                else
                    y++;

            }

        }
    }
}
