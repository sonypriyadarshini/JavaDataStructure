package array.dynamicProgramming;

import java.lang.reflect.Array;

public class LongestPallindromSubstring {

    public static void main(String[] args) {
        longestpallindrome("abcba");
    }

    public static void longestpallindrome(String s) {

        int length = s.length();
        int start = 0, end = 0;
        boolean[][] res = new boolean[length][length];

        //substring with 1 char will always be pallindrome. so, setting res[0][0] to true where 0,0 are start and end positions of the substring.
        for (int i = 0; i < length; i++) {
            res[i][i] = true;
            end = 1;
        }

        //substring with 2 chars will only be pallindrome if both chars are same. so, setting res[i][i+1] to true if both chars are same
        //where (0,1) (1,2) (2,3) etc are start and end positions of the substring.
        for (int i = 0; i < length - 1; i++) {
//            k = 2;
            if (s.charAt(i) == s.charAt(i + 1)) {
                res[i][i + 1] = true;
                start=i;
                end = 2;
            }
        }

        //for substring with length >=3, check if start and end chars are same && if other letters in the middle are pallindrome too
        // (can be fetched from the previous diagonal value in result matrix
        for (int k = 3; k <= length; k++) {
            for (int i = 0; i < length - k + 1; i++) {
                int j = i + k - 1;
                if (s.charAt(i) == s.charAt(j) && res[i + 1][j - 1]) {
                    res[i][j] = true;
                    if (k > end) {
                        end = k;
                        start = i;

                    }

                }
            }
        }
        System.out.println(s.substring(start, start+end));
    }


}
