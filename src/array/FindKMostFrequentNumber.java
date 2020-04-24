package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//https://www.geeksforgeeks.org/find-k-numbers-occurrences-given-array/

public class FindKMostFrequentNumber {

    public static void main(String[] args) {
        int arr[] =  {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        kMostFrequetNum(arr,4);

    }

    static void kMostFrequetNum(int a[],int k){
        HashMap<Integer,Numbers> hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(a[i])==false)
                hm.put(a[i],new Numbers(a[i],1));
            else
                hm.get(a[i]).count++;

        }
        Numbers val[]=hm.values().toArray(new Numbers[0]);
        Arrays.sort(val);
        for(int i=0;i<k;i++){
            System.out.println(val[i].key);
        }
    }
}

class Numbers implements Comparable<Numbers>{

    int key, count;
    Numbers(int key,int count){
        this.key=key;
        this.count=count;
    }

    @Override
    public int compareTo(Numbers obj ){
        if(this.count==obj.count)
        {
            return obj.key-this.key;
        }
        return obj.count-this.count;
    }
}
