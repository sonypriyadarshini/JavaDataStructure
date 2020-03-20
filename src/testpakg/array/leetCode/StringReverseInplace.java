package testpakg.array.leetCode;

import java.util.HashSet;

public class StringReverseInplace {
    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
    public static void reverseString(char[] s) {
        int start=0,end=s.length-1;
        char t;
        while(start<end){
            t=s[start];
            s[start]=s[end];
            s[end]=t;
            start++;
            end--;
        }
//        for(int i=0;i<s.length;i++)
////            System.out.println(s[i]);
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> hm=new HashSet<>();
        int res=-1;
        for(int i:nums){
            System.out.println("kdsjf   "+i);
            if(hm.contains(i)){
                hm.remove(i);
            System.out.println(    hm.remove(i));
            }
            else
                hm.add(i);
        }
        for(int i:hm){
            res= i;
            System.out.println("nums    "+i);
        }
        return res;
    }


}
