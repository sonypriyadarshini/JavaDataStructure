package crackingTheCodingInterview.chapter3_StacksAndQueues;

import java.util.Stack;

//https://www.geeksforgeeks.org/sort-stack-using-temporary-stack/

public class SortStack {

    static Stack<Integer> sortStackHelper(Stack<Integer> stack){
        Stack<Integer> tempStack=new Stack<>();
        while(!stack.isEmpty()){
            int x=stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek()>x ){
                stack.push(tempStack.pop());
            }
            tempStack.push(x);
        }
        return tempStack;
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(100);
        stack.push(10);
        stack.push(101);
        stack.push(12);
        System.out.println(sortStackHelper(stack));
    }
}
