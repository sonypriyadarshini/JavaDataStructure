package testpakg.array;

//Given an testpakg.array A[] and a number x, check for pair in A[] with sum as x

import java.util.HashMap;
import java.util.HashSet;

public class SumInPair {
    public static void main(String args[]){
        int ar[] = { 1, 5, 7, -1, 5 };
        int sum = 6;
        SumInPair sumInPair = new SumInPair();
//        sumInPair.findPair(ar,sum);
        sumInPair.findPairUsingHash(ar,sum);
//        sumInPair.findPairUsingMap(ar,sum);
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

    public void findPairUsingMap(int arr[], int sum){
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i:arr) {
            if (hm.containsKey(i))
                hm.put(i, hm.get(i) + 1);
            else
                hm.put(i, 1);
        }
        for(int i=0;i<arr.length;i++){
            int temp = sum-arr[i];
            if(temp==arr[i]){
                if(hm.get(temp)>1)
                    System.out.println("pair is ("+arr[i]+" , "+temp+")");
            }
            else {
                if(hm.containsKey(temp))
                    System.out.println("pair is ("+arr[i]+" , "+temp+")");
            }
        }
    }
}
