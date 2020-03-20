package testpakg.crackingTheCodingInterview.chapter16_MediumLevelPrograms;

import java.util.HashSet;

public class PairsWithSumInArray_24 {

    public static void main(String[] args) {
        int ar[] = { 1, 5, 7, -1 };
        int sum = 6;
        findSumPairs(ar,sum);
    }

    static void findSumPairs(int ar[],int sum){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<ar.length;i++){
            int rem=sum-ar[i];
            if(hs.contains(rem))
                System.out.println(ar[i]+" , "+rem);
            hs.add(ar[i]);
        }
    }
}
