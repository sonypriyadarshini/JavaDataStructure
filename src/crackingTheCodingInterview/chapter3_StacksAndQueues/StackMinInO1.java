package crackingTheCodingInterview.chapter3_StacksAndQueues;

import java.util.Stack;

//https://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/

public class StackMinInO1 extends Stack<Integer> {

    Stack<Integer> min = new Stack<>();

    void push(int el){
        if(isEmpty()){
            super.push(el);
            min.push(el);
        }
        else{
            super.push(el);
            if(el<=min.peek())
                min.push(el);
        }
    }

    public Integer pop(){
        int x=super.pop();
        if(min.peek()==x)
            min.pop();
        return x;
    }

    public int getMin(){
        return min.peek();
    }

    public static void main(String[] args) {
        StackMinInO1 s=new StackMinInO1();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }
}
