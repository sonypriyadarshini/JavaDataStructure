package testpakg.array.leetCode;

public class StringToNumberAtoI {
    public static void main(String[] args) {
        System.out.println(myAtoi( "    -2767-75b-1 ksdjhfk47483648"));
    }

    public static int myAtoi(String str) {
        double res = 0;
        int j = -1;
        int sign = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
            } else if (str.charAt(i) == '-') {
                if (str.length() > 1) {
                    if (Character.isDigit(str.charAt(i + 1))) {
                        sign = -1;
                        if (i + 1 < str.length()) {
                            j = i + 1;
                        }
                        break;
                    }
                    return (int) res;
                }
                return (int) res;
            } else if (str.charAt(i) == '+') {
                if (str.length() > 1) {
                    if (Character.isDigit(str.charAt(i + 1))) {
                        if (i + 1 < str.length()) {
                            j = i + 1;
                        }
                        break;
                    }
                    return (int) res;
                }
                return (int) res;

            } else if (Character.isDigit(str.charAt(i))) {
                j = i;
                break;
            } else
                return (int) res * sign;
        }
        if (j != -1) {
            for (; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j))) {
                    res = res * 10 + str.charAt(j) - '0';
                    System.out.println(res);
                    if (res > Integer.MAX_VALUE) {
                        if (sign == -1) {
                            res = Integer.MIN_VALUE;
                            break;
                        } else {
                            res = Integer.MAX_VALUE;
                            break;
                        }
                    }
                } else
                    return (int) res * sign;
            }
        }
        return (int) res * sign;

    }
}
