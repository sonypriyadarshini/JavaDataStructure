package algorithm;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/policemen-catch-thieves/

public class GreedyPoliceCatchThief {

    public static void main(String[] args) {
        Character arr[] = { 'T', 'T', 'P', 'P', 'T', 'P' };
        int k = 1;
        policeThief(arr,k);
    }

    static void policeThief(Character ar[], int k){
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> t=new ArrayList<>();
        int res=0;
        int a=0;
        for(Character i:ar){
            if(i.equals('P')){
                p.add(a);
            i++;}
            else if(i.equals('T')){
                t.add(a);
                i++;}
        }

        int pcount=0,tcount=0;
        while(pcount<p.size() && tcount<t.size()){
            if(Math.abs(p.get(pcount)-t.get(tcount))<=k){
                res++;
                pcount++;
                tcount++;
            }
            else if(p.get(pcount)<p.get(tcount)){
                pcount++;
            }
            else if(t.get(tcount)<t.get(pcount)){
                tcount++;
            }
        }
        System.out.println("Thieves caught: "+res);
    }
}
