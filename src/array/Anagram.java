package array;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public static void main(String args[]) {
        String s1 = "abcde";
        String s2 = "edcab";
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1);
        System.out.println(c2);
        boolean b = false;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == c2[i])
                b = true;
            else {
                b = false;
                break;
            }
        }
        if (b == true)
            System.out.println("anagram");
        else
            System.out.println("not anagram");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
    }
}
