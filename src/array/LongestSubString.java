package array;
/*In a string */
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static void main(String args[]) {

        longestSubSequence();
    }

    public static void longestSubSequence() {
        int a[] = { 25,7,8, 2, 21, 5, 4, 52, 3, 4,6};
        int temp = 0, count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : a)
            set.add(i);
        for (int i = 0; i < set.size(); i++) {
            if (!set.contains(a[i] - 1)) {
                temp = a[i];
                while (set.contains(temp))
                    temp++;
                if (count < temp - a[i]) {
                    count = temp - a[i];
                }
            }
        }
        System.out.println(count);
    }

}
