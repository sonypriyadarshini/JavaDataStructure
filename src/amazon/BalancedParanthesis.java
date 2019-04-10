package amazon;

import java.util.Stack;

//>>>>>>>>>Incomplete

public class BalancedParanthesis {

    public static void main(String args[]){
        char c1[]={'(',')','{','(',')','}','[','}',']'};
        String s2="(){()}[{()}]";
        checkBalancedParanthesis(c1);
    }

    public static void checkBalancedParanthesis(char s[]){
        Stack<String> stack = new Stack<>();

        for(int i=0;i<s.length;i++){
//            if(s[i]== '{'||s[i]=='('||s[i]=='[')
//                stack.push(s[i]);
//
//            if(s[i]=='}'||s[i]==')'||s[i]==']')
//            {
//                if(s[i]==')'&& stack.pop()=='(')
//                    break;
//                else if(s[i]=='}'&& stack.pop()=='{')
//                    break;
//                else if(s[i]==']'&& stack.pop()=='[')
//                    break;
//                System.out.println("not ordered");
//            }
        }

    }
}
