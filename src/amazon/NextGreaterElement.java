package amazon;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        nextGreater();
    }

    public static void nextGreater() {
        int[] arr = {11, 13, 21, 3};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        int element = 0,next;
        for (int i = 1; i < arr.length; i++) {
            next = arr[i];
            if (stack.isEmpty() == false) {
                element = stack.pop();
                while (next > element) {
                    System.out.println(element + " : " + next);
                    if (stack.isEmpty() == true)
                        break;
                    element = stack.pop();
                }
                if (element > next)
                    stack.push(element);
            }
            stack.push(next);
        }
        while(stack.isEmpty()==false)
        {
            element=stack.pop();
            next=-1;
            System.out.println(element + " : " + next);
        }
    }
}
