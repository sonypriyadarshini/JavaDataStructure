package testClasses;

import java.util.LinkedList;
import java.util.*;


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


//    public static void main(String[] args) {
//        reconstructQueue(new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}});


//        char a[]={'a','b',' ','c',' ',' ',' '};
////        if(a[2]==' '){a[2]}
//        ArrayList<int[]> res = new ArrayList<int[]>();
//        res.add(0,new int[]{1,0});
//        res.add(0,new int[]{2,0});
//        res.add(1,new int[]{5,1});
//        res.add(1,new int[]{3,1});

//        int arr1[] = {100, 112, 256, 349, 770   };
//        int arr2[] = {72 ,86, 113 ,119 ,265 ,445, 89};
//        int k = 5;
//        System.out.println(kth(arr1, arr2, k));
//
//        int n = 16;

        // function call
//        System.out.println(diff(16,3    ));


//        int n = 17;
//        int l = 2, r = 3;
//        System.out.println(toggleBitsFromLToR(n, l, r));

//
//        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
//        int n = arr.length;
//        int maxDiff = maxIndexDiff(arr, n);
//        System.out.println(maxDiff);



//        char set[] = {'a', 'b', 'c'};
//        printSubsets(set);


//        String s = "aabacbebebe";
//        int k = 3;
//        kUniques(s, k);

//        int l = 11, p = 2,
//                q = 3, r = 5;
//
//        // Calling Function
//        int ans = findMaximum(l, p, q, r);
//        System.out.println( ans);

//        String cc="998n";
//        int z='0';
//        System.out.println(z);
//        for(int i=0;i<cc.length();i++){
//            if(!(cc.charAt(i)-'0'>=0 && cc.charAt(i)-'0'<= 9))
//            {  System.out.println("false");
//                break;
//                }
//
//        }
//        System.out.println(revrecur("abcd"));

//        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//        int n = arr.length;
//        rearrange(arr, n);
//
//        System.out.print("\nModified Array\n");
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//
//    }
















    static void countSort(int[] arr)
    {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < count.length; i++)
        {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--)
        {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = output[i];
        }
    }

    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = {-5, -10    , 0, -3, 8, 5, -1, 10};
        int a[]={};
        countSort(arr);
        printArray(arr);
    }







































    public static void rearrange(int arr[], int n)
    {
        // initialize index of first minimum and first
        // maximum element
        int max_idx = n - 1, min_idx = 0;

        // store maximum element of array
        int max_elem = arr[n - 1] + 1;

        // traverse array elements
        for (int i = 0; i < n; i++) {
            // at even index : we have to put
            // maximum element
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_elem) * max_elem;
                max_idx--;
            }

            // at odd index : we have to put minimum element
            else {
                arr[i] += (arr[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }

        System.out.print("\nModified Array\n");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // array elements back to it's original form
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_elem;
    }

    static String revrecur(String s){
        if(s.length()==1)
            return s;
        return s.charAt(s.length()-1)+revrecur(s.substring(0,s.length()-1));

}

    static int findMaximum(int l, int p,
                           int q, int r)
    {

        // Array to store the
        // cut at each length
        int dp[] = new int[l + 1];

        // All values with -1
        for(int i = 0; i < l + 1; i++)
            dp[i] = -1;


        // if length of rod is 0
        // then total cuts will
        // be 0 so, initialize
        // the dp[0] with 0
        dp[0] = 0;

        for (int i = 0; i <= l; i++)
        {

            // if certain length
            // is not possible
            if (dp[i] == -1)
                continue;

            // if a segment of
            // p is possible
            if (i + p <= l)
                dp[i + p] = Math.max(dp[i + p],
                        dp[i] + 1);

            // if a segment of
            // q is possible
            if (i + q <= l)
                dp[i + q] = Math.max(dp[i + q],
                        dp[i] + 1);

            // if a segment of
            // r is possible
            if (i + r <= l)
                dp[i + r] = Math.max(dp[i + r],
                        dp[i] + 1);
        }

        // return value corresponding
        // to length l
        return dp[l];
    }


    final static int MAX_CHARS = 26;

    // This function calculates number of unique characters
// using a associative array count[]. Returns true if
// no. of characters are less than required else returns
// false.
    static boolean isValid(int count[], int k) {
        int val = 0;
        for (int i = 0; i < MAX_CHARS; i++) {
            if (count[i] > 0) {
                val++;
            }
        }

        // Return true if k is greater than or equal to val
        return (k >= val);
    }

    // Finds the maximum substring with exactly k unique chars
    static void kUniques(String s, int k) {
        int u = 0; // number of unique characters
        int n = s.length();

        // Associative array to store the count of characters
        int count[] = new int[MAX_CHARS];
        Arrays.fill(count, 0);
        // Traverse the string, Fills the associative array
        // count[] and count number of unique characters
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i) - 'a'] == 0) {
                u++;
            }
            count[s.charAt(i) - 'a']++;
        }

        // If there are not enough unique characters, show
        // an error message.
        if (u < k) {
            System.out.print("Not enough unique characters");
            return;
        }

        // Otherwise take a window with first element in it.
        // start and end variables.
        int curr_start = 0, curr_end = 0;

        // Also initialize values for result longest window
        int max_window_size = 1, max_window_start = 0;

        // Initialize associative array count[] with zero
        Arrays.fill(count, 0);

        count[s.charAt(0) - 'a']++;  // put the first character

        // Start from the second character and add
        // characters in window according to above
        // explanation
        for (int i = 1; i < n; i++) {
            // Add the character 's[i]' to current window
            count[s.charAt(i) - 'a']++;
            curr_end++;

            // If there are more than k unique characters in
            // current window, remove from left side
            while (!isValid(count, k)) {
                count[s.charAt(curr_start) - 'a']--;
                curr_start++;
            }

            // Update the max window size if required
            if (curr_end - curr_start + 1 > max_window_size) {
                max_window_size = curr_end - curr_start + 1;
                max_window_start = curr_start;
            }
        }

        System.out.println("Max sustring is : "
                + s.substring(max_window_start, max_window_size)
                + " with length " + max_window_size);
    }


    static void printSubsets(char set[])
    {
        int n = set.length;

        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < n; j++)

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
            {
                System.out.print(i & (1 >> j));
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
            }

            System.out.println("}");
        }
    }



    static int maxIndexDiff(int arr[], int n)
    {
        int maxDiff;
        int i, j;

        int RMax[] = new int[n];
        int LMin[] = new int[n];

        /* Construct LMin[] such that LMin[i] stores the minimum value
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = arr[0];
        for (i = 1; i < n; ++i)
            LMin[i] = Math.min(arr[i], LMin[i - 1]);

        /* Construct RMax[] such that RMax[j] stores the maximum value
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = arr[n - 1];
        for (j = n - 2; j >= 0; --j)
            RMax[j] = Math.max(arr[j], RMax[j + 1]);

        /* Traverse both arrays from left to right to find optimum j - i
           This process is similar to merge() of MergeSort */
        i = 0; j = 0; maxDiff = -1;
        while (j < n && i < n)
        {
            if (LMin[i] < RMax[j])
            {
                maxDiff = Math.max(maxDiff, j - i);
                j = j + 1;
            }
            else
                i = i + 1;
        }

        return maxDiff;
    }

    static int toggleBitsFromLToR(int n, int l, int r)
    {
        // calculating a number 'num' having 'r'
        // number of bits and bits in the range l
        // to r are the only set bits
        int num = ((1 << r) - l);

        // toggle bits in the range l to r in 'n'
        // and return the number
        //Besides this, we can calculate num as: num=(1<<r)-l .
        return (n ^ num);
    }

    static int diff(int i, int j){
        int x=1;
        while(i!=0 || j!=0){
            if((i&1) != (j&1))
                x++;
            i=i>>1;
            j=j>>1;
        }
        return x-1;
    }
    static int PositionRightmostSetbit(int n)
    {
        // Position variable initialize
        // with 1 m variable is used to
        // check the set bit
        int position = 1;
        int m = 1;

        while ((n & m) == 0) {

            // left shift
            n = n >> 1;
            position++;
        }
        return position;
    }

    static int kth(int a[], int b[], int k){
        int alen=a.length;
        int blen=b.length;
        int i=0,j=0;
        int res=0;
        int n=-1;
        while(i<alen && j<blen){
            if(a[i]<b[j]){
                i++;
                n=1;
            }
            else{
                j++;
                n=2;
            }
            res++;
            if(k==res+1) {
                if (n == 1)
                    res = a[i];
                else if(n==2)
                    res = a[j];

                break;
            }
        }
        return res;
    }

    static void findsubstring(String str, String x) {
        int res = -1, j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x.charAt(j) || str.charAt(i) == x.charAt(0)) {
                j++;

                if (j == x.length()) {
                    res = i - x.length() + 1;
                    break;
                }
            } else
                j = 0;

        }
        System.out.println(res);
    }


    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0])
                    return a[1] - b[1];
                else
                    return b[0] - a[0];
            }
        });
        // for(int i=0;i<people.length;i++)
        //     for(int j=0;j<people[0].length;j++){
        //         System.out.println(people[i][j]);
        //     }


        ArrayList<int[]> res = new ArrayList<int[]>();
        for (int[] p : people) {
            System.out.println(p[1]);
            System.out.println(p[0]);
            res.add(p[1], p);
            System.out.println(res.get(p[1]));

        }

        return res.toArray(new int[people.length][2]);
    }


    public static boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return true;
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + " :  " + nums.length);
            max = Math.max(max, i + nums[i]);
            if (max < i + 1)
                return false;
            if (max >= nums.length - 1)
                return true;
        }
        return false;
    }


    public static String removeKdigits(String num, int k) {
        StringBuilder sb1 = new StringBuilder(num);
        StringBuilder sb = new StringBuilder(num);
        int j = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) > Integer.parseInt(String.valueOf(num.charAt(i + 1))) && k > 0) {
                sb = sb1.deleteCharAt(i - j);
                j++;
//                sb1 = new StringBuilder(num);
                k--;
            } else {
                continue;

            }


        }
        return sb.toString();

    }


    static int basicCalc2(String s) {
        Stack<Long> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        StringBuilder number = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number.append(c);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (number.length() != 0) {
                    operands.push(Long.valueOf(number.toString()));
                    number = new StringBuilder();
                }
                if (operators.isEmpty())
                    operators.push(c);
                else if (!operands.isEmpty() && c == '+' || c == '-' && operands.peek() == '*' || operands.peek() == '/') {
                    while (!operators.isEmpty()) {
                        operands.push(calculate(operands, operators.pop()));
                    }
                } else if (!operands.isEmpty() && c == '*' || c == '/' && operands.peek() == '+' || operands.peek() == '-') {
                    operators.push(c);
                } else {
                    operands.push(calculate(operands, operators.pop()));
                    operators.push(c);
                }
            }
            i++;
        }
        if (number.length() != 0)
            operands.push(Long.valueOf(number.toString()));
        while (!operators.isEmpty()) {
            operands.push(calculate(operands, operators.pop()));
        }
        return (int) operands.pop().longValue();


    }

    static long calculate(Stack<Long> operands, Character operator) {
        long a = operands.pop();
        long b = operands.pop();
        if (operator == '+')
            return a + b;
        else if (operator == '-')
            return a - b;
        else if (operator == '/')
            return a / b;
        else if (operator == '*')
            return a * b;
        return 0;
    }

    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....


    public static int[][] merge(int[][] intervals) {

        if ((intervals == null) || (intervals.length < 1)) {
            return new int[0][];
        }

        if (intervals.length == 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (result.isEmpty()) {
                result.add(interval);
                continue;
            }

            int[] prev = result.get(result.size() - 1);

            if (interval[0] > prev[1]) {
                // No overlap between prev and interval
                result.add(interval);
            } else {
                // Overlap between prev and interval - extending prev
                prev[1] = Math.max(prev[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static String fractionToDecimal(int numerator, int denominator) {

        if (numerator == 0) return "0";
        StringBuilder builder = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) builder.append("-");

        //converts to long to get rid of the pesky int overflow
        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);

        builder.append((n / d));
        if ((n %= d) == 0) return builder.toString();
        builder.append(".");

        //map stores the index in our  builder where we first encounter this numerator
        Map<Long, Integer> numerators = new HashMap<>();
        while (!numerators.containsKey(n)) {
            System.out.println("into while");
            numerators.put(n, builder.length());
            n *= 10;
            builder.append(n / d);
            System.out.println("n  " + n);
            if ((n %= d) == 0)
                return builder.toString();
        }
        //we use the index to insert our bracket
        System.out.println("n  " + n);
        return builder.insert(numerators.get(n), "(").append(")").toString();
    }


    public static boolean isHappy(int n) {
        int temp = n;
        int res = 0, x = 0;
        HashSet<Integer> hs = new HashSet<>();
        while (x != 1) {
            int rem = temp % 10;
            res += (rem * rem);
            temp = temp / 10;
            if (temp == 0) {
                temp = res;
                x = res;
                res = 0;
                System.out.println(temp);

                if (hs.add(temp) == false)
                    return false;
            }
        }
        return true;
    }


    public static int firstUniqChar(String s) {
        //using linkedhashset
        char[] c = s.toCharArray();
        int count = 0;

        LinkedHashMap<Character, Integer> hs = new LinkedHashMap<>();
        for (char a : c) {
            hs.put(a, hs.getOrDefault(a, 0) + 1);
        }
        for (char a : c) {

            if (hs.get(a) == 1)
                return count;
            count++;
        }
        if (count == c.length)
            return -1;
        return -1;
        //using char array of 26

        //using indexof and lastindexof
    }


    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i : nums)
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);

        List<HashMap.Entry> list = new LinkedList<HashMap.Entry>(hashMap.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        ArrayList<Integer> arrayList = new ArrayList<>(sortedHashMap.keySet());
        int i = arrayList.size() - 1;
        while (i >= arrayList.size() - k) {
            res.add(arrayList.get(i));
            i--;
        }
        return res;

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

