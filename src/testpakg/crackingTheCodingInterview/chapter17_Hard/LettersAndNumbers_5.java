package testpakg.crackingTheCodingInterview.chapter17_Hard;

import java.util.HashMap;

/*
Letters and Numbers: Given an testpakg.array filled with letters and numbers,
find the longest subarray with an equal number of letters and numbers. in O(n)

https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2017.%20Hard/Q17_05_Letters_and_Numbers/QuestionB.java
 */
public class LettersAndNumbers_5 {

    public static void main(String[] args) {
        char b = '1';
        char a = 'a';
        char[] array = {a, b, a, b,b,b, a};
        findLargestSubarray(array);
    }

    static void findLargestSubarray(char c[]){
        int deltas[]=findDeltas(c);
        int max[]=findMax(deltas);
        for(int i=max[0]+1;i<=max[1];i++)
            System.out.println(c[i]);

    }

    static int[] findMax(int d[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,  -1);
        int max[]=new int[2];

        for(int i=0;i<d.length;i++){
            if(!hm.containsKey(d[i])){
                hm.put(d[i],i);
            }
            else{
                int t=hm.get(d[i]);
                int dist=i-t;
                int longestDist=max[1]-max[0];
                if(dist>longestDist)
                {
                    max[1]=i;
                    max[0]=t;
                }
            }
        }
        return max;
    }

    static int[] findDeltas(char c[]){
        int deltas[]=new int[c.length];
        int count=0;
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i]))
                count++;
            else
                count--;
            deltas[i]=count;

        }
        return deltas;
    }
}
