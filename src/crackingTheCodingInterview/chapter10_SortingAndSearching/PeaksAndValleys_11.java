package crackingTheCodingInterview.chapter10_SortingAndSearching;

/*
Peaks and Valleys: In an array of integers, a "peak" is an element which is greater than or equal to the adjacent integers
 and a "valley" is an element which is less than or equal to the adjacent inte- gers.
 For example, in the array [5, 8,6, 2, 3,4, 6), {8,6} are peaks and {5, 2} are valleys.
  Given an array of integers, sort the array into an alternating sequence of peaks and valleys.

https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/
 */

import java.util.Arrays;

public class PeaksAndValleys_11 {

    public static void main(String[] args) {
        int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};
        int res[]=peaksAndValleySort(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" , ");
        }

    }
//O(nlongn) solution - as it is with sorting
    static int[] peaksAndValleySort(int a[]){

        //sort the given array
        Arrays.sort(a);
        int n=a.length;

        //starting from index 1, swap elements i,i+1 alternately
        for(int i=1;i<n-1;i=i+2){
            if(a[i]>a[i+1])
                continue;
            else if(a[i]<a[i+1] ){
                a=swap(a,i,i+1);
            }
        }
        return a;
    }

    static int[] swap(int ar[],int i, int j){
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
        return ar;

    }

    //O(n) solution - without sorting
}
