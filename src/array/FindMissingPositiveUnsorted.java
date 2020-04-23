package array;
//https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array-set-2/?ref=rp

/*
Find the smallest positive number missing from an unsorted array | Set 2
Given an unsorted array with both positive and negative elements. Find the smallest positive number missing
 from the array in O(n) time using constant extra space. It is allowed to modify the original array.

Examples:

Input:  {2, 3, 7, 6, 8, -1, -10, 15}
Output: 1

Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
Output: 4

Input: {1, 1, 0, -1, -2}
Output: 2
 */

public class FindMissingPositiveUnsorted {
    public static void main(String[] args) {

        int a[]= {1, 1, 0, -1, -2};

        System.out.println(findMissingPositive(a));
    }

    static int findMissingPositive(int a[]){

        for(int i=0;i<a.length;i++){

            if(a[i]>=0 && a[i]<a.length && a[a[i]]>0){
                a[a[i]]= -1*a[a[i]];
            }
        }

        for(int i=1;i<a.length;i++){
            if(a[i]>=0)
                return i;

        }
        return -1;
    }
}
