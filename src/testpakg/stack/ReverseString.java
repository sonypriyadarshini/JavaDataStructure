package testpakg.stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String args[]){
        StringBuffer s = new StringBuffer("sonyashish");
        Stack<Character> stack1 = new Stack<>();

        for(int i =0; i<s.length();i++){
            stack1.push(s.charAt(i));
        }
        for(int i =0; i<s.length();i++){
            char ch = stack1.pop();
            s.setCharAt(i,ch);
        }
        System.out.println(s);

    }
}
