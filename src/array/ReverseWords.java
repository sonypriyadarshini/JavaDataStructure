package array;

import java.util.Stack;

public class ReverseWords {

    public static void main(String args[]){
        reversewords();
    }

    public static void reversewords(){
        String str="abc def gdhi";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                stack.push(str.charAt(i));
            }
            else
            {
                while (stack.empty()!=true)
                    System.out.print(stack.pop());
            }
            System.out.print(" ");
        }
        while (stack.empty() == false) {
            System.out.print(stack.pop());

        }
    }
}
