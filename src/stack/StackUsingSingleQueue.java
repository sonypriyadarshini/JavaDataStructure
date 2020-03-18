package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingSingleQueue {
    Queue<Integer> queue1 = new LinkedList<Integer>();

    public static void main(String args[]){
        StackUsingSingleQueue stack = new StackUsingSingleQueue();
        stack.push(32);
        stack.push(322);
        stack.push(321);
        stack.pop();
    }

    public void push(int data){
        System.out.println("============");
        int c =queue1.size();
        queue1.add(data);

        for(int i=0;i<c;i++){
            int p=queue1.remove();
            System.out.println("pop "+p);
            queue1.add(p);
        }
    }

    public void pop(){
        System.out.println("popping "+queue1.remove());
    }

    int top()
    {
        if (queue1.isEmpty())
            return -1;
        return queue1.peek();
    }
}
