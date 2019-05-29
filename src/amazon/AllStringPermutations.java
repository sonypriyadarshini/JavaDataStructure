package amazon;

public class AllStringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n - 1);
    }

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
}
