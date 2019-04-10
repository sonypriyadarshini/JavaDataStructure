package array;

import java.util.Stack;

public class OrderedBracket {
    public static void main(String args[]) {
        String s = "{}[{()}][]";
        findbracketorder(s);
    }

    public static void findbracketorder(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ']' || s.charAt(i) == ')' || s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    System.out.println("unordered");
                    return;
                }
                if (s.charAt(i) == ']') {
                    if (stack.pop() != '[') {
                        System.out.println("222");
                        return;
                    }
                } else if (s.charAt(i) == '}') {
                    if (stack.pop() != '{') {
                        System.out.println("444");
                        return;
                    }
                } else if (s.charAt(i) == ')') {
                    if (stack.pop() != '(') {
                        System.out.println("555");
                        return;
                    }
                }
            }

        }
        if (stack.isEmpty())
            System.out.println("ordered");
        else System.out.println("Unordered");

    }
}
