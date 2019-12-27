import java.lang.reflect.Array;
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


    public static void main(String[] args) {
//        reconstructQueue(new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}});


        char a[]={'a','b',' ','c',' ',' ',' '};
//        if(a[2]==' '){a[2]}
        ArrayList<int[]> res = new ArrayList<int[]>();
        res.add(0,new int[]{1,0});
        res.add(0,new int[]{2,0});
        res.add(1,new int[]{5,1});
        res.add(1,new int[]{3,1});
    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){
            @Override
            public int compare(int[]a,int[]b){
                if(a[0] == b[0])
                    return a[1]-b[1];
                else
                    return b[0]-a[0];
            }
        });
        // for(int i=0;i<people.length;i++)
        //     for(int j=0;j<people[0].length;j++){
        //         System.out.println(people[i][j]);
        //     }


        ArrayList<int[]> res = new ArrayList<int[]>();
        for(int[] p : people){
            System.out.println(p[1]);
            System.out.println(p[0]);
            res.add(p[1],p);
            System.out.println(res.get(p[1]));

        }

        return res.toArray(new int[people.length][2]);
    }



    public static boolean canJump(int[] nums) {
        if(nums==null || nums.length==0){
            return false;
        }
        if(nums.length==1){
            return true;
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            System.out.println(i+" :  "+nums.length);
            max=Math.max(max,i+nums[i]);
            if(max<i+1)
                return false;
            if(max>=nums.length-1)
                return true;
        }
        return false;
    }







    public static String removeKdigits(String num, int k) {
        StringBuilder sb1 = new StringBuilder(num);
        StringBuilder sb = new StringBuilder(num);
int j=0;
        for(int i=0;i<num.length()-1;i++){
            if(Integer.parseInt(String.valueOf(num.charAt(i)))>Integer.parseInt(String.valueOf(num.charAt(i+1))) && k>0){
                sb=sb1.deleteCharAt(i-j);
                j++;
//                sb1 = new StringBuilder(num);
                k--;
            }
            else{
                continue;

            }


        }
        return sb.toString();

    }






    static int basicCalc2(String s)
    {
        Stack<Long> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        StringBuilder number = new StringBuilder();
        int i=0;

        while(i<s.length()){
            char c= s.charAt(i);
            if(Character.isDigit(c)){
                number.append(c);
            }
            else if(c=='+' || c=='-' || c=='*' || c=='/'){
                if(number.length()!=0){
                    operands.push(Long.valueOf(number.toString()));
                    number=new StringBuilder();
                }
                if(operators.isEmpty())
                    operators.push(c);
                else if(!operands.isEmpty() && c=='+' || c=='-' && operands.peek()=='*' || operands.peek()=='/'){
                    while (!operators.isEmpty()){
                        operands.push(calculate(operands,operators.pop()));
                    }
                }
                else if(!operands.isEmpty() && c=='*' || c=='/' && operands.peek()=='+' || operands.peek()=='-'){
                   operators.push(c);
                }
                else{
                    operands.push(calculate(operands,operators.pop()));
                    operators.push(c);
                }
            }
            i++;
        }
        if(number.length()!=0)
            operands.push(Long.valueOf(number.toString()));
        while (!operators.isEmpty()){
            operands.push(calculate(operands,operators.pop()));
        }
        return (int)operands.pop().longValue();


    }
    static long calculate(Stack<Long> operands, Character operator){
        long a=operands.pop();
        long b=operands.pop();
        if(operator=='+')
            return a+b;
        else   if(operator=='-')
            return a-b;
        else   if(operator=='/')
            return a/b;
        else   if(operator=='*')
            return a*b;
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

        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));

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
        long n = Math.abs((long)numerator);
        long d = Math.abs((long)denominator);

        builder.append((n/d));
        if ((n %= d) == 0) return builder.toString();
        builder.append(".");

        //map stores the index in our  builder where we first encounter this numerator
        Map<Long, Integer> numerators = new HashMap<>();
        while(!numerators.containsKey(n)) {
            System.out.println("into while");
            numerators.put(n, builder.length());
            n *= 10;
            builder.append(n/d);
            System.out.println("n  "+n);
            if ((n %= d) == 0)
                return builder.toString();
        }
        //we use the index to insert our bracket
        System.out.println("n  "+n);
        return builder.insert(numerators.get(n),"(").append(")").toString();
    }



    public static boolean isHappy(int n) {
        int temp=n;
        int res=0,x=0;
        HashSet<Integer> hs=new HashSet<>();
        while(x!=1){
            int rem=temp%10;
            res+=(rem*rem);
            temp=temp/10;
            if(temp==0){
                temp=res;
                x=res;
                res=0;
                System.out.println(temp);

                if(hs.add(temp)==false)
                    return false;
            }
        }
        return true;
    }


    public static int firstUniqChar(String s) {
        //using linkedhashset
        char c[]=s.toCharArray();
        int count=0;
        
        LinkedHashMap<Character,Integer> hs=new LinkedHashMap<>();
        for(char a:c){
            hs.put(a,hs.getOrDefault(a,0)+1);
        }
        for(char a:c){

            if(hs.get(a)==1)
                return count;
            count++;
        }
        if(count==c.length)
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

        List list = new LinkedList(hashMap.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
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

