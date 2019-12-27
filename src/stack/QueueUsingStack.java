package stack;

import java.util.Stack;

public class QueueUsingStack {
    static StackMainPushPop stackMainPushPop = new StackMainPushPop();
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();


    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enqueue(3);
        queueUsingStack.enqueue(30);
        queueUsingStack.enqueue(39);
        queueUsingStack.enqueue(37);
        queueUsingStack.dequeue();
        queueUsingStack.dequeue();
    }

    public void enqueue(int data) {
        stack1.push(data);
    }

    public void dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                int y = stack1.pop();
                System.out.println("pop " + y);
                stack2.push(y);
            }
        }
        int x = stack2.pop();
        System.out.println("popped " + x);
    }
}
