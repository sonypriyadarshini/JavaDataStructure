import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Input: "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.

/*
Input: "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".

Notice that some of these substrings repeat and are counted the number of times they occur.

Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 */

public class TestClass {

    public static void main(String[] args) {


        System.out.println(countBinarySubstrings("1100"));
    }
    public static int countBinarySubstrings(String s) {
        if (s.length() < 2) return 0;
        int count = 0;
        char last = '/';
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (i == 0) last = curr;//special case for first char
            if (curr == '1') {
                if (curr != last) ones = 0;//clear 1 count since 1 is not consecutive with previous 1
                ones++;
            } else {
                if (curr != last) zeros = 0;//clear 0 count since 0 is not consecutive with previous 0
                zeros++;
            }
            if (zeros != 0 && ones != 0) {
                if (curr == '0' && zeros <= ones) count++;
                else if (curr == '1' && zeros >= ones) count++;
            }
            last = curr;//update last char
        }
        return count;
    }


    public static String convert(String s, int numRows) {
        Character[][] res = new Character[numRows][s.length()];
        int i = 0, j = 0, k = numRows - 1;
        if (numRows <= 1)
            return s;
        for (int x = 0; x < s.length(); x++) {
            if (i != numRows && k != 0 && k == (numRows - 1)) {
                if (i == 0 && j != 0)
                    i++;
                res[i][j] = s.charAt(x);
                System.out.println(res[i][j] + " 1  inserted to (" + i + "" + j + ")      " + k);
                i++;
                if (i == numRows)
                    k = 0;
            } else if (i == numRows) {
                i = i - 2;
                k++;
                j++;
                res[i][j] = s.charAt(x);
                System.out.println(res[i][j] + " 2  inserted to (" + i + "" + j + ")    " + k);
            } else {
                i--;
                j++;
                k++;
                res[i][j] = s.charAt(x);
                System.out.println(res[i][j] + " 3  inserted to (" + i + "" + j + ")    " + k);
            }
        }
        String resStr = "";
        for (int a = 0; a < res.length; a++) {
            for (int b = 0; b < res[a].length; b++) {
                if (res[a][b] != null)
                    resStr = resStr + res[a][b];
            }
        }
        return resStr;

    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        int rem = 0, res = 0;

        if (x < 0) {
            return false;
        }
        while (x != 0) {
            rem = x % 10;
            x = x / 10;
            res = res * 10 + rem;
        }
        return temp == res;
    }

    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int res = 0;
        while (l < r) {
            res = Math.max(res, Integer.min(height[l], height[r]) * (r - l));

            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return res;

    }

    public static void test1(String str) {
        str = "dvdf";
        str = "pwwkew";
        str = "nfpdmpi";
        str = "aabaab!bb";
        str = "bopfbhmipx";

        String s1 = "";
//        String s1=null;
        int length = 0, k = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            k = 0;
            if (s1.contains(Character.toString(str.charAt(i)))) {
                while (s1.contains(Character.toString(str.charAt(i)))) {
                    System.out.println("======:  " + s1);
                    System.out.println("removing  " + s1.charAt(k) + "   === from location:  " + k);
                    s1 = s1.substring(k - 1, k);
                }
                System.out.println("adding " + str.charAt(i));
                s1 = s1 + str.charAt(i);
//                s1.append(str.charAt(i));
                System.out.println("======:  " + s1);
            } else {
                System.out.println("adding " + str.charAt(i));
                s1 = s1 + str.charAt(i);
//                s1.append(str.charAt(i));
                System.out.println("======:  " + s1);
                length = s1.length();
                list.add(length);
            }
        }
        if (list.isEmpty())
            System.out.println(length);
        System.out.println(Collections.max(list));
    }




}

