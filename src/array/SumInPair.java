package array;

//Given an array A[] and a number x, check for pair in A[] with sum as x

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SumInPair {
    public static void main(String args[]){
        int ar[] = {1,33,32,2,4,2,3,3,4,5,6};
        int sum = 7;
        SumInPair sumInPair = new SumInPair();
        sumInPair.findPair(ar,sum);
        sumInPair.findPairUsingHash(ar,sum);
    }

    //Complexity:: O(n^2)
    public void findPair(int arr[], int s){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==s)
                    System.out.println("pair is ("+arr[i]+" , "+arr[j]+")");
            }
        }
    }

    //use hashing
    //complexity O(n)
    public void findPairUsingHash(int arr[], int sum){
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            int temp = sum - arr[i];
            if(hs.contains(temp))
                System.out.println("pair is ("+arr[i]+" , "+temp+")");
            hs.add(arr[i]);
        }
    }
}
