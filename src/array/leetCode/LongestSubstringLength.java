package array.leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/

/*
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

public class LongestSubstringLength {
    public static void main(String args[]) {

        lengthOfLongestSubstring("nxxdffssdieruie");
    }

    public static int lengthOfLongestSubstring(String s) {
        int length=0,k=0;
        StringBuilder stringBuilder=new StringBuilder();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            k=0;
            if(stringBuilder.toString().contains(Character.toString(s.charAt(i)))){
                while(stringBuilder.toString().contains(Character.toString(s.charAt(i)))){
                    stringBuilder.deleteCharAt(k);
                }
                stringBuilder.append(s.charAt(i));
            }
            else{
                stringBuilder.append(s.charAt(i));
                length=stringBuilder.length();
                list.add(length);
            }
        }
        if(list.isEmpty())
            return 0;
        else
            return Collections.max(list);
    }
}
