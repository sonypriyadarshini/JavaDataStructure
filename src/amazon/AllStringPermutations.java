package amazon;

/*
https://www.youtube.com/watch?v=AfxHGNRtFac


string with duplicate char
https://www.youtube.com/watch?v=nYFd7VHKyWQ

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllStringPermutations {
    public static void main(String[] args) {
        String str = "123";
        int n = str.length();
        permute(str, 0, n - 1);
    }

    //works for string with unique characters only
    public static void permute(String str, int l, int r) {

        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int x, int y) {
        char[] c = a.toCharArray();
        char temp = c[x];
        c[x] = c[y];
        c[y] = temp;
        return String.valueOf(c);
    }






    //trial: other way: incomplete
    public static List<List<Integer>> permuteInt(int[] nums) {

        int l = 0, r = nums.length - 1, i = 0;
        return permuteIntWithVar(nums, l, r);

    }

    public static List<List<Integer>> permuteIntWithVar(int[] nums, int l, int r) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<List<Integer>> resF = new ArrayList<List<Integer>>();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        int i = 0;
        if (l == r) {
//            System.out.println(nums);

            while (i != nums.length) {
                ar.add(nums[i]);
//                System.out.print(ar.get(i));
                i++;
//                System.out.print("  , ");
            }
//            System.out.println(ar);
            res.add(ar);
            return res;
//            System.out.println(res);
        } else {
            for (i = l; i < nums.length; i++) {
                nums = swaparray(nums, l, i);
                res=permuteIntWithVar(nums, l + 1, r);
                nums = swaparray(nums, l, i);

                resF.add(res.get(res.size()-1));
                System.out.println(i+"  i  "+resF);

            }
        }
//        System.out.println(resF);
        return resF;
    }

    public static int[] swaparray(int[] nums, int l, int i) {
        int t = nums[l];
        nums[l] = nums[i];
        nums[i] = t;
        return nums;
    }
}
