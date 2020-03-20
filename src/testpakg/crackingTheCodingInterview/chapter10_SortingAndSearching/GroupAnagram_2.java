package testpakg.crackingTheCodingInterview.chapter10_SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Group Anagrams: Write a method to sort an testpakg.array of strings so that all the anagrams are next to each other.

https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagram_2 {

    public static void main(String[] args) {
        String s[]={"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<String> r=groupStrings(s);
        System.out.println(r);
    }

    static ArrayList<String> groupStrings(String s[]){
        HashMap<String, List<String>> hashMap=new HashMap<>();
        for(String st:s){
            char c[]=st.toCharArray();
            Arrays.sort(c);
            if(!hashMap.containsKey(String.valueOf(c))){
                hashMap.put(String.valueOf(c),new ArrayList<>());
            }
            hashMap.get(String.valueOf(c)).add(st);
        }
        return new ArrayList(hashMap.values());
    }
}
