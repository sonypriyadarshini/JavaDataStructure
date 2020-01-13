package crackingTheCodingInterview.chapter8_DynamicProgAndRecursion;
/*
MagicIndex:AmagicindexinanarrayA[0...n-1]isdefinedtobeanindexsuchthatA[i] = i.
Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in array A.

https://www.geeksforgeeks.org/find-a-fixed-point-in-a-given-array/
 */
public class Magiczindex_3 {

    public static void main(String[] args) {
        int arr[] = {-10, -1, 0, 3 , 10, 11, 30, 50, 100};
        int n = arr.length;
        System.out.println(findMagicIndex(arr,0,n));
    }

    static int findMagicIndex(int a[],int start, int end){
        int mid;
        if(start<=end)
        {
             mid=(start+end)/2;
             if(a[mid]==mid){
                 return mid;
             }
             if(a[mid]>mid)
                 return findMagicIndex(a,start,mid-1);
             else
                 return findMagicIndex(a,mid+1,end);

        }
        return -1;


    }
}
