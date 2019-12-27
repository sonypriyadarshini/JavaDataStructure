package crackingTheCodingInterview.chapter3_StacksAndQueues;


import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

     void enqueue(int el){
        s1.push(el);
    }

    int dequeue(){
         if(s2.isEmpty()){
             while(!s1.isEmpty())
                 s2.push(s1.pop());
         }
         return s2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q=new QueueUsingStacks();
        q.enqueue(3);
        q.enqueue(34);
        q.enqueue(23);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());


    }

}
