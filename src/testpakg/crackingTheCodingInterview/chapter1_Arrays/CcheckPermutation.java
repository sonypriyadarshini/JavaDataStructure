package testpakg.crackingTheCodingInterview.chapter1_Arrays;

//https://www.geeksforgeeks.org/check-if-two-strings-are-permutation-of-each-other/
//Check Permutation: Given two strings, write a method to decide if one is a permutation of the
//other.


import java.util.Arrays;

public class CcheckPermutation {
    public static void main(String[] args) {

        System.out.println(validatePermutation("abcda","bcda"));
    }

    //METHOD-1: sort both strings and compare. O(nlogn)

    //METHOD-2: use an testpakg.array to keep count.
    static boolean  validatePermutation(String str1,String str2)
    {
        if(str1.length()!=str2.length())
            return false;

        int count[]=new int[256];
        Arrays.fill(count,0);
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}
