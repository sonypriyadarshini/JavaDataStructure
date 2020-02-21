package crackingTheCodingInterview.chapter17_Hard;
/*
https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2017.%20Hard/Q17_10_Majority_Element/QuestionB.java
https://www.geeksforgeeks.org/frequent-element-array/
 */

import java.util.HashMap;

public class MajorityElement_10 {

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 1, 1, 0, 14, 13, 10, 1, 1};
        System.out.println(findMajorityElement(array));
        findElement(array);
    }

    // 1. method1: using hashmap
    static int findMajorityElement(int a[]){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<a.length;i++){
                hashMap.put(a[i],hashMap.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<a.length;i++){
            if(hashMap.get(a[i])>a.length/2)
                return a[i];
        }
        return -1;
    }

    // 2. method2
    static void findElement(int a[]){
        int max=findElementHelper(a);
        int res= validate(max,a);
        System.out.println( res);
    }

    static int findElementHelper(int a[]){
        int count =0;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(count==0)
                max=a[i];
            if(a[i]==max)
                count++;
            else
                count--;
        }
        return max;
    }

    static int validate(int m, int a[]){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==m)
                c++;

        }
        if(c>a.length/2)
            return m;
        return -1;
    }
}
