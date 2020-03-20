package testpakg.amazon;

import java.util.Stack;

//>>>>>>>>>Incomplete

public class BalancedParanthesis {

    public static void main(String args[]){
        char c1[]={'(',')','{','(',')','[',']'};
        checkBalancedParanthesis(c1);
    }

    public static void checkBalancedParanthesis(char[] s) {
        Stack<String> stack = new Stack<>();
        boolean b = false;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '{' || s[i] == '(' || s[i] == '['){
                stack.push(String.valueOf(s[i]));
            }

            else if (s[i] == '}' || s[i] == ')' || s[i] == ']') {
                if (stack.isEmpty()) {
                    b = false;
                    break;
                }
                String n = stack.pop();
                if (s[i] == ')' && n.equalsIgnoreCase( "(")) {
                    b = true;
//                    break;
                } else if (s[i] == '}' && n.equalsIgnoreCase("{")) {
                    b = true;
//                    break;
                } else if (s[i] == ']' && n.equalsIgnoreCase("[")) {
                    b = true;
//                    break;
                } else {
                    b = false;
                    break;
                }
            }
        }
        if (stack.isEmpty())
            b=true; /*balanced*/
        else
        {   /*not balanced*/
            b= false;
        }
        System.out.println(b);
    }
}
