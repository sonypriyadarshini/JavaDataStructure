package crackingTheCodingInterview.chapter10_SortingAndSearching;

/*
Sorted Search, No Size: You are given an array-like data structure Listy which lacks a size method. It does, however,
have an elementAt ( i ) method that returns the element at index i in 0(1) time,
if i is beyond the bounds of the data structure, it returns -1. (For this reason,
the data structure only supports positive integers.) Given a L i s t y which contains sorted, positive integers,
find the index at which an element X occurs. If x occurs multiple times, you may return any index.

https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2010.%20Sorting%20and%20Searching/Q10_04_Sorted_Search_No_Size/Arrayish/Question.java
 */
public class SortedSearchNoSize_4 {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 16, 18};
        System.out.println(searchSorted(14,array));
    }

    static int searchSorted(int val,int a[]){
        int index=1;
        while(index<a.length && val>a[index]){
            index*=2;
        }
        return binarySearch1(val,a,index/2,index);
    }

    static int binarySearch1(int val, int a[], int start, int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(val==a[mid])
                return mid;
            else if(val> a[mid])
                return binarySearch1(val,a,mid+1,end);
            else
                return binarySearch1(val,a,start,mid-1);
        }
        return -1;

    }
}
