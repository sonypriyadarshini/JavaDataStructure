import java.util.Stack;

public class StackClass {

    //implemmenting queue using stack.
    /*
    method2:
   enQueue(q,  x)
  1) Push x to stack1 (assuming size of stacks is unlimited).
Here time complexity will be O(1)

deQueue(q)
  1) If both stacks are empty then error.
  2) If stack2 is empty
       While stack1 is not empty, push everything from stack1 to stack2.
  3) Pop the element from stack2 and return it.
Here time complexity will be O(n)
*/
    static class Queue {
        static Stack<Integer> stack1 = new Stack<Integer>();
        static Stack<Integer> stack2 = new Stack<Integer>();

        static void push(int x) {

            //push all elements from stack1 to stack2
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());

            //once stack1 is empty, push the new element
            if (stack1.isEmpty())
                stack1.push(x);

            //get rest of the pushed elements back from stack2 to stack1
            while (!stack2.isEmpty())
                stack1.push(stack2.pop());
        }

        static int pop() {

            int popEle = stack1.peek();
            stack1.pop();
            return popEle;
        }

        static void print(){
            while (!stack1.isEmpty()){
                System.out.println(stack1.pop());
            }
        }
    }

    //implementing queue using stack
    public static void main(String args[]) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.pop();
        q.print();
    }

}
