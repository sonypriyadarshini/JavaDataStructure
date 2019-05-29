package array.optimization;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MiniumumDifference {
    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 5, 3, 19, 18, 25};
        System.out.println("Minimum difference is "+
                findMinDiff(arr, arr.length));
    }

    public static int findMinDiff(int arr[], int n){

        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;

        for(int i=0;i<n-1;i++){
            if(diff>arr[i+1]-arr[i])
                diff = arr[i+1]-arr[i];
        }
        return diff;

    }
}
