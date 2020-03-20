package testpakg.crackingTheCodingInterview.chapter3_StacksAndQueues;

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

    static void sortedInsert(Stack<Integer> s, int x)
    {
        // Base case: Either testpakg.stack is empty or newly inserted
        // item is greater than top (more than all existing)
        if (s.isEmpty() || x > s.peek())
        {
            s.push(x);
            return;
        }

        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);

        // Put back the top item removed earlier
        s.push(temp);
    }

    // Method to sort testpakg.stack
    static void sortStack(Stack<Integer> s)
    {
        // If testpakg.stack is not empty
        if (!s.isEmpty())
        {
            // Remove the top item
            int x = s.pop();

            // Sort remaining testpakg.stack
            sortStack(s);

            // Push the top item back in sorted testpakg.stack
            sortedInsert(s, x);
        }
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
