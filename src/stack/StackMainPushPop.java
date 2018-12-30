package stack;

public class StackMainPushPop {

    public static void main(String args[]){
        StackMainPushPop stackObj = new StackMainPushPop();
        stackObj.push(3);
        stackObj.push(33);
        stackObj.push(34);
        stackObj.push(32);
        stackObj.printStack();
        stackObj.pop();
        stackObj.printStack();
        stackObj.pop();
        stackObj.printStack();
        stackObj.push(30);
        stackObj.printStack();
    }

    public void push(int data){
        Node n = new Node(data);
        if(head==null){
            head=n;
            head.next=null;
            return;
        }

        n.next=head;
        head=n;

    }
    public int pop(){
        Node temp=head;
        head = head.next;
        temp.next=null;
        System.out.println("poping "+temp.data);
        return (temp.data);
    }

    public void printStack(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void reverse(){

    }
    static Node head, tail;
    static class Node{
        Node next;
        int data;
        Node(int d){
            data =d;
        }
    }
}
