package crackingTheCodingInterview.chapter10_SortingAndSearching;

/*
Sorted Merge: You are given two sorted arrays, A and B, where A has a large enough buffer at the
end to hold B. Write a method to merge B into A in sorted order.

https://www.geeksforgeeks.org/sorted-merge-one-array/

 */

public class Merge2SortedArrayIntoOne_1 {

    static int NA =-1;

    public static void main(String[] args) {

        int a[] = {10, 12, 13, 14, 18, NA, NA, NA, NA, NA};
        int n = 5;
        int size_a = 10;
        int b[] = {16, 17, 19, 20, 22};
        int m = 5;
        int x[]=sortedMerge(a, b, n, m);
        for (int i = 0; i < size_a; i++)
            System.out.print(x[i] +" ");

    }

    static int[] sortedMerge(int a[],int b[],int as,int bs){

        int k=as+bs-1;
        int x=as-1,y=bs-1;
        while(y>=0){
            if(x>=0 && a[x]>b[y]){
                a[k]=a[x];
                x--;

            }
            else {
                a[k]=b[y];
                y--;
            }
            k--;
        }
        return a;
    }
}
