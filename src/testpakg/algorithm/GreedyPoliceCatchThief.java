package testpakg.algorithm;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/policemen-catch-thieves/

public class GreedyPoliceCatchThief {

    public static void main(String[] args) {
        char arr[] = { 'T', 'T', 'P', 'P', 'T', 'P' };
        int k = 1;
        policeThief(arr,k);
    }

    static void policeThief(char ar[], int k){
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> t=new ArrayList<>();
        int res=0;
        int a=0;
        // store indices in the ArrayList
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 'P')
                p.add(i);
            else if (ar[i] == 'T')
                t.add(i);
        }

        int l = 0, r = 0;
        while (l < t.size() && r < p.size()) {

            // can be caught
            if (Math.abs(t.get(l) - p.get(r)) <= k) {
                res++;
                l++;
                r++;
            }

            // increment the minimum index
            else if (t.get(l) < p.get(r))
                l++;
            else
                r++;
        }
        System.out.println("Thieves caught: "+res);
    }
}
